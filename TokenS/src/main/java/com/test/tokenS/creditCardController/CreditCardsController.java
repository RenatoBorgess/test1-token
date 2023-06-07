package com.test.tokenS.creditCardController;

import com.test.tokenS.arrayCreditCardService.ArrayCreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CreditCardsController {
    @Autowired
    ArrayCreditCardService arrayCreditCardService;

    @PostMapping("/keepingOriginalArray")
    public CreditCard[] reverseArrayKeepingTheOriginal(@RequestBody CreditCard[] cards) {
        return arrayCreditCardService.reverseNewArray(cards);
    }


}
