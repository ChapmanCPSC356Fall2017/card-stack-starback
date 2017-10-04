package com.example.ryanstarback.cardstack;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by ryanstarback on 10/4/17.
 */

public class Card {
    private CardSuite suite;
    private CardType type;

    public Card(CardSuite suite, CardType type) {
        this.suite = suite;
        this.type = type;
    }

    public static Stack<Card> shuffledCardStack() {
        Stack<Card> cardStack = new Stack<>();

        for (CardSuite suite : CardSuite.values()) {
            for (CardType type : CardType.values()) {
                Card card = new Card(suite, type);
                cardStack.push(card);
            }
        }

        Collections.shuffle(cardStack);
        return cardStack;
    }

    public CardSuite getSuite() {
        return suite;
    }

    public CardType getType() {
        return type;
    }
}
