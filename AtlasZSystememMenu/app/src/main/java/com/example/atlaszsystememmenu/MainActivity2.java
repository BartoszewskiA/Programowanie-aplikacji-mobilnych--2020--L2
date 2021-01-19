package com.example.atlaszsystememmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView r = findViewById(R.id.ramka);
        Bundle paczka = getIntent().getExtras();
        int id = paczka.getInt("IdZdjecia");
        switch (id)
        {
            case R.drawable.p01: r.setImageResource(R.drawable.p01); break;
            case R.drawable.p02: r.setImageResource(R.drawable.p02); break;
            case R.drawable.p03: r.setImageResource(R.drawable.p03); break;
            case R.drawable.p04: r.setImageResource(R.drawable.p04); break;
        }

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}