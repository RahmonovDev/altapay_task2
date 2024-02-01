package com.example.task2.payload;

import com.example.task2.entity.Card;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class CardTransactionDTO {

    private Long id;
    private String type;

    private Long amount;

    @JsonProperty("old_balance")
    private Long oldBalance;

    @JsonProperty("new_balance")
    private Long newBalance;

    private Timestamp dt;

    public CardTransactionDTO(Long id, String type, Long amount, Long oldBalance, Long newBalance, Timestamp dt) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.oldBalance = oldBalance;
        this.newBalance = newBalance;
        this.dt = dt;
    }

    public CardTransactionDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(Long oldBalance) {
        this.oldBalance = oldBalance;
    }

    public Long getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Long newBalance) {
        this.newBalance = newBalance;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "CardTransactionDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", oldBalance=" + oldBalance +
                ", newBalance=" + newBalance +
                ", dt=" + dt +
                '}';
    }
}
