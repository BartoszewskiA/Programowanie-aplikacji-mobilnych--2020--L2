package com.example.ekran_logowania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    String zalogowany="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle paczka = getIntent().getExtras();
        zalogowany = paczka.getString("kto");
    }
}