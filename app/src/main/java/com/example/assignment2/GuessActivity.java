package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class GuessActivity extends AppCompatActivity {

    int randomnumber;

    public void GUESS(View view) {
        Button guess = (Button) findViewById(R.id.GUESS);


        EditText userInput = (EditText) findViewById(R.id.number);

        int guessnumber = Integer.parseInt(userInput.getText().toString());

        if (randomnumber == guessnumber) {
            Toast.makeText(getApplicationContext(), "CONGRATULATIONS!!! YOUR NUMBER FOUND", Toast.LENGTH_LONG).show();

            Random rand = new Random();
            randomnumber = rand.nextInt(20) + 1;

        } else if (randomnumber > guessnumber) {
            Toast.makeText(getApplicationContext(), "YOUR NUMBER IS LOW,ENTER HIGHER NUMBER", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "YOUR NUMBER IS HIGH,ENTER LOWER NUMBER", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        Random rand = new Random();
        randomnumber = rand.nextInt(20) + 1;


        Button logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuessActivity.this, MainActivity.class));
            }
        });
    }
}





