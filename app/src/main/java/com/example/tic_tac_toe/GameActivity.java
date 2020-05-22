package com.example.tic_tac_toe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class GameActivity extends Activity {
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonQuit;
    Button buttonReset;

    private void activateButtons() {
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonQuit = findViewById(R.id.button_quit);
        buttonReset = findViewById(R.id.button_reset);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activateButtons();

    }

    public void onButtonOneClick() {

    }
    public void onButtonTwoClick() {

    }
    public void onButtonThreeClick() {

    }
    public void onButtonFourClick() {

    }
    public void onButtonFiveClick() {

    }
    public void onButtonSixClick() {

    }
    public void onButtonSevenClick() {

    }
    public void onButtonEightClick() {

    }
    public void onButtonNineClick() {

    }
    public void onButtonQuitClick() {

    }
    public void onButtonResetClick() {

    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_one:

            case R.id.button_two:

            case R.id.button_three:

            case R.id.button_four:

            case R.id.button_five:

            case R.id.button_six:

            case R.id.button_seven:

            case R.id.button_eight:

            case R.id.button_nine:

            case R.id.button_quit:

            case R.id.button_reset:

        }
    }
}
