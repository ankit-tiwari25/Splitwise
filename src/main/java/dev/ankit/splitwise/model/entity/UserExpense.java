package dev.ankit.splitwise.model.entity;

import dev.ankit.splitwise.model.entity.constant.UserExpenseType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private UserExpenseType userExpenseType;
    private double amount;

    public UserExpense() {
    }

    public UserExpense(User user, UserExpenseType userExpenseType, double amount) {
        this.user = user;
        this.userExpenseType = userExpenseType;
        this.amount = amount;
    }
}
