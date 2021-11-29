package com.example.socialmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Thread thread = new Thread(){

            @Override
            public void run() {
                try{
                    sleep(2000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }

                finally {
                    Intent intent = new Intent(Splash_screen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}