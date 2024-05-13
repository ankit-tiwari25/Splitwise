package dev.ankit.splitwise.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Entity
@Getter
@Setter
public class SettlementTransaction extends BaseModel{
    @ManyToOne
    private User borrower;
    @ManyToOne
    private User lendor;
    private double amount;
    private Currency currency;

    public SettlementTransaction() {
    }

    public SettlementTransaction(User borrower, User lendor, double amount, Currency currency) {
        this.borrower = borrower;
        this.lendor = lendor;
        this.amount = amount;
        this.currency = currency;
    }
}
