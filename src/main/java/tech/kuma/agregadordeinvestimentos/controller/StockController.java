package tech.kuma.agregadordeinvestimentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.kuma.agregadordeinvestimentos.controller.dto.CreateStockDto;
import tech.kuma.agregadordeinvestimentos.controller.dto.CreateUserDto;
import tech.kuma.agregadordeinvestimentos.entity.User;
import tech.kuma.agregadordeinvestimentos.service.StockService;

import java.net.URI;

@RestController
@RequestMapping("/v1/stocks")
public class StockController {

    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping
    public ResponseEntity<Void> createStock(@RequestBody CreateStockDto createStockDto) {

        stockService.createStock(createStockDto);
        return ResponseEntity.ok().build();
    }
}
