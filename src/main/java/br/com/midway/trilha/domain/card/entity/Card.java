package br.com.midway.trilha.domain.card.entity;

import br.com.midway.trilha.domain.card.util.Category;
import br.com.midway.trilha.domain.card.util.TypeCard;

import java.util.Date;
import java.util.UUID;

// CAMADA DE ANTI CORRUPÇÃO
// DOMINIO RICO
public class Card {
    private UUID id;
    private String cardNumber;
    private Category category;
    private String label;
    private TypeCard type;
    private Date expireDate;
    private String code;

    public Card(UUID id, String cardNumber, Category category, String label, TypeCard type, Date expireDate, String code) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.category = category;
        this.label = label;
        this.type = type;
        this.expireDate = expireDate;
        this.code = code;
    }

    public boolean isCardVisa() {
        return getCardNumber().startsWith("4");
    }

    public boolean containsOptionOfCredit() {
        return (getType() == TypeCard.CREDIT || getType() == TypeCard.CREDIT_AND_DEBIT);
    }

    public UUID getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Category getCategory() {
        return category;
    }

    public String getLabel() {
        return label;
    }

    public TypeCard getType() {
        return type;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public String getCode() {
        return code;
    }
}
