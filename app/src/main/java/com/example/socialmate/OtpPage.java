package com.example.socialmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OtpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page);
        getSupportActionBar().hide();
    }
}