package com.example.socialmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgetPage extends AppCompatActivity {

    Button sendcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_forget_page);

        sendcode= findViewById(R.id.sendcode);
        sendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ForgetPage.this,"We've sent a verification code",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ForgetPage.this,OtpPage.class);
                startActivity(intent);
            }
        });
    }
}