package com.example.ekran_logowania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   EditText polePassword, poleUsername;
   Button buttonLogin;
   String osobaZalogowana="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polePassword = findViewById((R.id.password));
        poleUsername = findViewById(R.id.username);
        buttonLogin = findViewById(R.id.login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sprawdzDostep();
            }
        });
    }

    private void sprawdzDostep() {

        Intent intencja = new Intent(this, MainActivity2.class);
        intencja.putExtra("kto", osobaZalogowana);
        startActivity(intencja);
    }
}