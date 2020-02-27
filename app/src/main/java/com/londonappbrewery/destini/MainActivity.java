package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mStoryTextView;
    Button mTopButtonView;
    Button mBottomButtonView;

    int mStoryIndex = 1;
    int mPathIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButtonView = (Button) findViewById(R.id.buttonTop);
        mBottomButtonView = (Button) findViewById(R.id.buttonBottom);

        mTopButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex == 1) {
                    mPathIndex = 1;
                }

                if(mPathIndex == 1 && mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButtonView.setText(R.string.T3_Ans1);
                    mBottomButtonView.setText(R.string.T3_Ans2);
                } else if(mPathIndex == 1 && mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T6_End);
                    hideButtons();
                } else if (mPathIndex == 2 && mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButtonView.setText(R.string.T3_Ans1);
                    mBottomButtonView.setText(R.string.T3_Ans2);
                } else if (mPathIndex == 2 && mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    hideButtons();
                }

                mStoryIndex += 1;
            }
        });

        mBottomButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mPathIndex = 2;
                }

                if(mPathIndex == 2 && mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButtonView.setText(R.string.T2_Ans1);
                    mBottomButtonView.setText(R.string.T2_Ans2);
                } else if(mPathIndex == 1 && mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T5_End);
                    hideButtons();
                } else if(mPathIndex == 2 && mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    hideButtons();
                } else if (mPathIndex == 2 && mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);

                    hideButtons();
                }

                mStoryIndex += 1;
            }
        });

    }

    public void hideButtons() {
        mTopButtonView.setVisibility(View.GONE);
        mBottomButtonView.setVisibility(View.GONE);
    }


}
