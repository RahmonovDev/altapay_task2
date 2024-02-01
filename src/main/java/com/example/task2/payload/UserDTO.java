package com.example.task2.payload;

import com.example.task2.entity.Card;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class UserDTO {

    private Long id;

    private String fio;

    private String email;

    private Long phone;

    private Integer status;

    private Date dob;

    private Timestamp dt;

    @JsonProperty("cards")
    List<CardDTO> cardDTOList;

    public UserDTO(Long id, String fio, String email, Long phone, Integer status, Date dob, Timestamp dt, List<CardDTO> cardDTOList) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.dob = dob;
        this.dt = dt;
        this.cardDTOList = cardDTOList;
    }

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public List<CardDTO> getCardDTOList() {
        return cardDTOList;
    }

    public void setCardDTOList(List<CardDTO> cardDTOList) {
        this.cardDTOList = cardDTOList;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", status=" + status +
                ", dob=" + dob +
                ", dt=" + dt +
                ", cardDTOList=" + cardDTOList +
                '}';
    }
}
