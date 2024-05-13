package dev.ankit.splitwise.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends  BaseModel{
    private String description;
    @ManyToOne
    private User addedBy;
    private double amount;
    private LocalDateTime expenseTime;
    private Currency currency;
    @OneToMany
    private List<UserExpense> userExpenseList;

    public  Expense(){

    }

    public Expense(String description, User addedBy, double amount, LocalDateTime expenseTime, Currency currency, List<UserExpense> userExpenseList) {
        this.description = description;
        this.addedBy = addedBy;
        this.amount = amount;
        this.expenseTime = expenseTime;
        this.currency = currency;
        this.userExpenseList = userExpenseList;
    }
}
