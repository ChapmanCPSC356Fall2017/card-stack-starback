package com.example.ryanstarback.cardstack;

/**
 * Created by ryanstarback on 10/4/17.
 */

public enum CardSuite {
    DIAMONDS(R.string.diamonds),
    CLUBS(R.string.clubs),
    HEARTS(R.string.hearts),
    SPADES(R.string.spades);

    private int mResourceId;

    private CardSuite(int id) {
        mResourceId = id;
    }

    @Override
    public String toString() {
        return CardStack.context.getString(mResourceId);
    }
}
