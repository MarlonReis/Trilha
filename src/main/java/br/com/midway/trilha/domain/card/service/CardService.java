package br.com.midway.trilha.domain.card.service;

import br.com.midway.trilha.domain.card.entity.Card;
// Abstração
// Invarsão de dependencia
public interface CardService {
    void create(Card card);

    Card getCardByCardNumber(String cardNumber);
}
