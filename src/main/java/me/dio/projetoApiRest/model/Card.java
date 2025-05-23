package me.dio.projetoApiRest.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
   private String cardNumber;
    @Column(name= "available_limit",scale = 2, precision = 13)
   private BigDecimal cardLimit;

    public Card(){}

    public Card(String cardNumber, BigDecimal cardLimit) {
        this.cardNumber = cardNumber;
        this.cardLimit = cardLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
