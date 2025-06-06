package tech.kuma.agregadordeinvestimentos.service;

import org.springframework.stereotype.Service;
import tech.kuma.agregadordeinvestimentos.controller.dto.CreateStockDto;
import tech.kuma.agregadordeinvestimentos.entity.Stock;
import tech.kuma.agregadordeinvestimentos.repository.StockRepository;

@Service
public class StockService {

    private StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void createStock(CreateStockDto createStockDto) {

        // DTO -> Entity
        var stock = new Stock(
                createStockDto.stockId(),
                createStockDto.description()
        );

        stockRepository.save(stock);
    }
}
