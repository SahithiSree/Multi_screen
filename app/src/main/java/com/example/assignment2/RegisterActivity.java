package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        EditText name=(EditText)findViewById(R.id.name);
        EditText email=(EditText)findViewById(R.id.email);
        EditText mobile=(EditText)findViewById(R.id.mobile);
        EditText password=(EditText)findViewById(R.id.password);
        EditText confirmpassword=(EditText)findViewById(R.id.confirmpassword);

        Spinner city=(Spinner)findViewById(R.id.city);

        Button signup=(Button)findViewById(R.id.signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Signing Up.....",Toast.LENGTH_LONG).show();
                startActivity(new Intent(RegisterActivity.this,SecondActivity.class));
            }
        });

    }
        }




