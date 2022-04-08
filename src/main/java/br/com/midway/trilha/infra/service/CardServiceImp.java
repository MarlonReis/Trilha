package br.com.midway.trilha.infra.service;

import br.com.midway.trilha.domain.card.entity.Card;
import br.com.midway.trilha.domain.card.service.CardService;
// TODO:: Implemenar CustomerService e CustomerServiceImp

// Implementação
public class CardServiceImp implements CardService {
    // Somente devo depender de abastração e nunca de implementação
   // private final CustomerService service;

//    public CardServiceImp(CustomerService service) {
//        this.service = service;
//    }

    @Override
    public void create(Card card) {
      // Customer customer = service.getCustomerById(card.customerId());
        if (card.isCardVisa()) {
            System.out.println("VISA");
        }

        if (card.containsOptionOfCredit()) {
            System.out.println("TEM CREDITO");
        }
    }

    @Override
    public Card getCardByCardNumber(String cardNumber) {
        return null;
    }


}
