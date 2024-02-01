package com.example.task2.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.sql.Timestamp;

@Entity
@Table(name = "cards_transactions")
public class CardTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private Card card;

    @Column(name = "type", length = 6)
    @Check(constraints = "type IN ('debit', 'credit')")
    private String type;

    private Long amount;

    @Column(name = "old_balance")
    private Long oldBalance;

    @Column(name = "new_balance")
    private Long newBalance;

    @Column(columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
    private Timestamp dt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
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
        return "CardTransaction{" +
                "id=" + id +
                ", user=" + user +
                ", card=" + card +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", oldBalance=" + oldBalance +
                ", newBalance=" + newBalance +
                ", dt=" + dt +
                '}';
    }
}
