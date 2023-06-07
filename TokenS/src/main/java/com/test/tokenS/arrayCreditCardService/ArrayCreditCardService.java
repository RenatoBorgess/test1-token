package com.test.tokenS.arrayCreditCardService;

import com.test.tokenS.creditCardController.CreditCard;
import org.springframework.stereotype.Service;

import java.util.Arrays;



@Service
public class ArrayCreditCardService {


    public CreditCard[] reverseNewArray(CreditCard[] cards) {
        CreditCard[] copyOfCards = Arrays.copyOf(cards, cards.length);
        reverse(copyOfCards);
        return copyOfCards;
    }
    public CreditCard[] reverseArray(CreditCard[] cards) {
        reverse(cards);
        return cards;
    }


    public void reverse(CreditCard[] cards) {
        int start = 0;
        int end = cards.length - 1;

        while (start < end) {
            swap(cards, start, end);
            start++;
            end--;
        }
    }

    public void swap(CreditCard[] cards, int index1, int index2) {
        CreditCard temporary = cards[index1];
        cards[index1] = cards[index2];
        cards[index2] = temporary;

    }
}
