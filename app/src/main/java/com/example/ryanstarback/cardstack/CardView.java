package com.example.ryanstarback.cardstack;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CardView extends LinearLayout {
    @BindView(R.id.upper_left_type_text_view) TextView upperLeftTypeTextView;
    @BindView(R.id.upper_left_suite_icon_text_view) TextView upperLeftSuiteIconTextView;
    @BindView(R.id.center_suite_icon_text_view) TextView centerSuiteIconTextView;
    @BindView(R.id.lower_right_type_text_view) TextView lowerRightTypeTextView;
    @BindView(R.id.lower_right_suite_icon_text_view) TextView lowerRightSuiteIconTextView;

    public CardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.card_view_linear_layout, this);
        onFinishInflate();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        ButterKnife.bind(this);
    }

    public void setCard(Card card) {
        upperLeftTypeTextView.setText(card.getType().toString());
        upperLeftSuiteIconTextView.setText(card.getSuite().toString());

        centerSuiteIconTextView.setText(card.getSuite().toString());

        lowerRightTypeTextView.setText(card.getType().toString());
        lowerRightSuiteIconTextView.setText(card.getSuite().toString());

        switch (card.getSuite()) {
            case DIAMONDS:
                upperLeftTypeTextView.setTextColor(Color.RED);
                upperLeftSuiteIconTextView.setTextColor(Color.RED);
                centerSuiteIconTextView.setTextColor(Color.RED);
                lowerRightTypeTextView.setTextColor(Color.RED);
                lowerRightSuiteIconTextView.setTextColor(Color.RED);
                break;
            case HEARTS:
                upperLeftTypeTextView.setTextColor(Color.RED);
                upperLeftSuiteIconTextView.setTextColor(Color.RED);
                centerSuiteIconTextView.setTextColor(Color.RED);
                lowerRightTypeTextView.setTextColor(Color.RED);
                lowerRightSuiteIconTextView.setTextColor(Color.RED);
                break;
            case CLUBS:
                upperLeftTypeTextView.setTextColor(Color.BLACK);
                upperLeftSuiteIconTextView.setTextColor(Color.BLACK);
                centerSuiteIconTextView.setTextColor(Color.BLACK);
                lowerRightTypeTextView.setTextColor(Color.BLACK);
                lowerRightSuiteIconTextView.setTextColor(Color.BLACK);
                break;
            case SPADES:
                upperLeftTypeTextView.setTextColor(Color.BLACK);
                upperLeftSuiteIconTextView.setTextColor(Color.BLACK);
                centerSuiteIconTextView.setTextColor(Color.BLACK);
                lowerRightTypeTextView.setTextColor(Color.BLACK);
                lowerRightSuiteIconTextView.setTextColor(Color.BLACK);
                break;
        }
    }
}
