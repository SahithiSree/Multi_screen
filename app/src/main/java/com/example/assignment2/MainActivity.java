package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int splash_out=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
                                      @Override
                                      public void run() {
                                          startActivity(new Intent(MainActivity.this,SecondActivity.class));
                                          finish();


                                      }
                                  }
                ,splash_out);
    }
}


