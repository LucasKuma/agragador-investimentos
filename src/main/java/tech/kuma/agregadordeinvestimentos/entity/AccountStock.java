package tech.kuma.agregadordeinvestimentos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_account_stocks")
public class AccountStock {

    @EmbeddedId
    private AccountStockId id; // chave composta de id

    @ManyToOne
    @MapsId("accountId") // mapeia qual parte dessa chave composta é o accountId da entidade account
    @JoinColumn(name = "account_id") // cria a foreign key com uma nova coluna com o nome de account_id
    private Account account;

    @ManyToOne
    @MapsId("stockId")
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @Column(name = "quantity")
    private Integer quantity;

    public AccountStock() {
    }

    public AccountStock(AccountStockId id, Account account, Stock stock, Integer quantity) {
        this.id = id;
        this.account = account;
        this.stock = stock;
        this.quantity = quantity;
    }

    public AccountStockId getId() {
        return id;
    }

    public void setId(AccountStockId id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
