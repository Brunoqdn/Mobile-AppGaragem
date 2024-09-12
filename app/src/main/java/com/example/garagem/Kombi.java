package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class Kombi extends AppCompatActivity {

    private Button conferencia_kombi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kombi);

        Objects.requireNonNull(getSupportActionBar()).hide();

        conferencia_kombi = (Button) findViewById(R.id.conferencia_kombi);

        conferencia_kombi.setOnClickListener(view -> {
            Intent conf_kombi = new Intent(getApplicationContext(), ConferenciaKombi.class);
            startActivity(conf_kombi);
        });




    }
}