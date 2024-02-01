package com.example.task2.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.List;

public class CardDTO {

    private Long id;

    @JsonProperty("card_name")
    private String cardName;

    @JsonProperty("card_type")
    private String cardType;

    @JsonProperty("card_number")
    private String cardNumber;

    @JsonProperty("card_expire")
    private String cardExpire;

    private Long balance;

    private Integer status;

    private Timestamp dt;

    @JsonProperty("transactions")
    private List<CardTransactionDTO> cardTransactionDTOList;

    public CardDTO(Long id, String cardName, String cardType, String cardNumber, String cardExpire, Long balance, Integer status, Timestamp dt, List<CardTransactionDTO> cardTransactionDTOList) {
        this.id = id;
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpire = cardExpire;
        this.balance = balance;
        this.status = status;
        this.dt = dt;
        this.cardTransactionDTOList = cardTransactionDTOList;
    }

    public CardDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<CardTransactionDTO> getCardTransactionDTOList() {
        return cardTransactionDTOList;
    }

    public void setCardTransactionDTOList(List<CardTransactionDTO> cardTransactionDTOList) {
        this.cardTransactionDTOList = cardTransactionDTOList;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "id=" + id +
                ", cardName='" + cardName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardExpire='" + cardExpire + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", dt=" + dt +
                ", cardTransactionDTOList=" + cardTransactionDTOList +
                '}';
    }
}
