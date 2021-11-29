package com.example.socialmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SIgnUp extends AppCompatActivity {

    Button registration ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        registration = findViewById(R.id.registration);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SIgnUp.this,LogIn.class);
                startActivity(intent);
                Toast.makeText(SIgnUp.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            }
        });



    }
}