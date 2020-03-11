package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button login=(Button)findViewById(R.id.log);
        Button clear=(Button)findViewById(R.id.clear);
        final Button exit=(Button)findViewById(R.id.exit);
        Button signup=(Button)findViewById(R.id.signup);

        final EditText username=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {if(username.getText().toString().equals("sahithi")&&(password.getText().toString().equals("sahithi")))
            {
                Toast.makeText(getApplicationContext(),"Redirecting.......",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SecondActivity.this,GuessActivity.class));

            }
            else
            {
                Toast.makeText(getApplicationContext(),"Worng Credentials",Toast.LENGTH_SHORT).show();

            }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username.setText("");
                password.setText("");

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SecondActivity.this,RegisterActivity.class));
            }
        });

    }
}



















