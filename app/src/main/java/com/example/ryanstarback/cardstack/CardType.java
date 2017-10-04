package com.example.ryanstarback.cardstack;

/**
 * Created by ryanstarback on 10/4/17.
 */

public enum CardType {
    ACE(R.string.ace),
    TWO(R.string.two),
    THREE(R.string.three),
    FOUR(R.string.four),
    FIVE(R.string.five),
    SIX(R.string.six),
    SEVEN(R.string.seven),
    EIGHT(R.string.eight),
    NINE(R.string.nine),
    TEN(R.string.ten),
    JACK(R.string.jack),
    QUEEN(R.string.queen),
    KING(R.string.king);

    private int mResourceId;

    private CardType(int id) {
        mResourceId = id;
    }

    @Override
    public String toString() {
        return CardStack.context.getString(mResourceId);
    }
}
