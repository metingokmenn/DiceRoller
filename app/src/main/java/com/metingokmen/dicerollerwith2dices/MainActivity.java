package com.metingokmen.dicerollerwith2dices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView diceImage1;
    ImageView diceImage2;
    Button rollButton;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceImage1 = findViewById(R.id.diceImage1);
        diceImage2 = findViewById(R.id.diceImage2);
        rollButton = findViewById(R.id.rollButton);
    }

    public void rollDice(View view){
        int diceNumber1 = r.nextInt(6) +1;
        int diceNumber2 = r.nextInt(6) +1;
        String toastMessage = "";
        switch (diceNumber1){
            case 1:
                diceImage1.setImageResource(R.drawable.dice1);
                toastMessage = toastMessage + "I ";
                break;
            case 2:
                diceImage1.setImageResource(R.drawable.dice2);
                toastMessage = toastMessage + "II ";
                break;
            case 3:
                diceImage1.setImageResource(R.drawable.dice3);
                toastMessage = toastMessage + "III ";
                break;
            case 4:
                diceImage1.setImageResource(R.drawable.dice4);
                toastMessage = toastMessage + "IV ";
                break;
            case 5:
                diceImage1.setImageResource(R.drawable.dice5);
                toastMessage = toastMessage + "V ";
                break;
            case 6:
                diceImage1.setImageResource(R.drawable.dice6);
                toastMessage = toastMessage + "VI ";
                break;

        }
        switch (diceNumber2){
            case 1:
                diceImage2.setImageResource(R.drawable.dice1);
                toastMessage = toastMessage + "I ";
                break;
            case 2:
                diceImage2.setImageResource(R.drawable.dice2);
                toastMessage = toastMessage + "II ";
                break;
            case 3:
                diceImage2.setImageResource(R.drawable.dice3);
                toastMessage = toastMessage + "III ";
                break;
            case 4:
                diceImage2.setImageResource(R.drawable.dice4);
                toastMessage = toastMessage + "IV ";
                break;
            case 5:
                diceImage2.setImageResource(R.drawable.dice5);
                toastMessage = toastMessage + "V ";
                break;
            case 6:
                diceImage2.setImageResource(R.drawable.dice6);
                toastMessage = toastMessage + "VI ";
                break;
        }
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}