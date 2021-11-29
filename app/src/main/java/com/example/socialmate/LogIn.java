package com.example.socialmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    TextView forgetButton;
    Button registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().hide();
        forgetButton = findViewById(R.id.forget);
        registration= findViewById(R.id.registration);

        forgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this,ForgetPage.class);
                startActivity(intent);
            }
        });


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this,SIgnUp.class);
                startActivity(intent);
            }
        });
    }
}