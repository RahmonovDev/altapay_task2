package com.example.task2.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_type", length = 3)
    @Check(constraints = "card_type IN ('uz','hum')")
    private String cardType;

    @Column(name = "card_number", length = 20)
    private String cardNumber;

    @Column(name = "card_expire", length = 7)
    private String cardExpire;

    private Long balance;

    private Integer status;

    @Column(columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
    private Timestamp dt;

    @OneToMany(mappedBy = "card")
    private List<CardTransaction> cardTransactionList;

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

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpire() {
        return cardExpire;
    }

    public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public List<CardTransaction> getCardTransactionList() {
        return cardTransactionList;
    }

    public void setCardTransactionList(List<CardTransaction> cardTransactionList) {
        this.cardTransactionList = cardTransactionList;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", user=" + user +
                ", cardName='" + cardName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardExpire='" + cardExpire + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", dt=" + dt +
                '}';
    }
}
