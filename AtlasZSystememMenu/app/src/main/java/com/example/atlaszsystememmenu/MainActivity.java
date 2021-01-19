package com.example.atlaszsystememmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView r1,r2,r3,r4;
    View wybraneZdjecie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.imageView01);
        r2 = findViewById(R.id.imageView02);
        r3 = findViewById(R.id.imageView03);
        r4 = findViewById(R.id.imageView04);
        registerForContextMenu(r1);
        registerForContextMenu(r2);
        registerForContextMenu(r3);
        registerForContextMenu(r4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch(id)
        {
            case R.id.mainMenuPoz01: setContentView(R.layout.activity_main); break;
            case R.id.mainMenuPoz02: setContentView(R.layout.activity_main_dark); break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
        wybraneZdjecie = v;
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id)
        {
            case R.id.contextMenuPoz01:
                Intent intencja = new Intent(this, MainActivity2.class);
                switch (wybraneZdjecie.getId())
                {
                    case R.id.imageView01: intencja.putExtra("IdZdjecia", R.drawable.p01); break;
                    case R.id.imageView02: intencja.putExtra("IdZdjecia", R.drawable.p02); break;
                    case R.id.imageView03: intencja.putExtra("IdZdjecia", R.drawable.p03); break;
                    case R.id.imageView04: intencja.putExtra("IdZdjecia", R.drawable.p04); break;
                }
                startActivity(intencja);
                break;
        }
        return super.onContextItemSelected(item);
    }
}