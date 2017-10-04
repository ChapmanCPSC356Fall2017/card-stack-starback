package com.example.ryanstarback.cardstack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Stack;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.card_view_parent) LinearLayout cardViewParent;
    @BindView(R.id.card_view) CardView cardView;

    private Stack<Card> cardStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        cardStack = Card.shuffledCardStack();
        cardViewParent.setOnClickListener(mCardViewParentListener);

        cardView.setCard(cardStack.pop());
    }

    private View.OnClickListener mCardViewParentListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (cardStack.empty()) {
                finish();
                return;
            }

            cardView.setCard(cardStack.pop());
        }
    };
}
