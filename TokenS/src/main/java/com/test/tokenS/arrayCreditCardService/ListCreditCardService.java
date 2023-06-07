package com.test.tokenS.arrayCreditCardService;

import com.test.tokenS.creditCardController.CreditCard;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;

@Service
public class ListCreditCardService {

    public List<CreditCard> reverseList(List<CreditCard> cards) {

        Collections.reverse(cards);
        return cards;

    }
}

