package com.shanta.michael.thefrasergame;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Game1Activity extends AppCompatActivity {

    private ChallengeBook mChallengeBook = new ChallengeBook();
    private ColourWheel mColourWheel = new ColourWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game1);

        final TextView challenges = (TextView) findViewById(R.id.txtChallenge);
        //final Button nextChallengeButton = (Button) findViewById(R.id.one);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                String challenge = mChallengeBook.getChallenge();
                challenges.setText(challenge);
                int colour = mColourWheel.getColour();
                relativeLayout.setBackgroundColor(colour);

            }
        };
        relativeLayout.setOnClickListener(listener);

    }

}
