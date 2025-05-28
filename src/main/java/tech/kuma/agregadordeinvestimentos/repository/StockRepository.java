package tech.kuma.agregadordeinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.kuma.agregadordeinvestimentos.entity.Account;
import tech.kuma.agregadordeinvestimentos.entity.Stock;

import java.util.UUID;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
}
