package com.test.tokenS.creditCardController;

import com.test.tokenS.arrayCreditCardService.ArrayCreditCardService;
import com.test.tokenS.arrayCreditCardService.ListCreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CreditCardsController {
    @Autowired
    ArrayCreditCardService arrayCreditCardService;
    @Autowired
    ListCreditCardService listCreditCardService;

    @PostMapping("/keepingOriginalArray")
    public CreditCard[] reverseArrayKeepingTheOriginal(@RequestBody CreditCard[] cards) {
        return arrayCreditCardService.reverseNewArray(cards);
    }

    @PostMapping("/arrayInPlace")
    public CreditCard[] reverseArrayInPlace(@RequestBody CreditCard[] cards) {
        return arrayCreditCardService.reverseArray(cards);
    }

    @PostMapping("/listOfCards")
    public List<CreditCard> reverseListInPlace(@RequestBody List<CreditCard> cards) {
        return listCreditCardService.reverseList(cards);

    }
}
