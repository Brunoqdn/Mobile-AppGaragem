package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button kombi, celta, polo, fiesta, doblo, escala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        kombi = findViewById(R.id.Kombi);

        kombi.setOnClickListener(view -> {
            Intent kombiIt = new Intent(getApplicationContext(), Kombi.class);
            startActivity(kombiIt);
        });

        celta = findViewById(R.id.Celta);

        celta.setOnClickListener(view -> {
            Intent celtaIt = new Intent(getApplicationContext(), Celta.class);
            startActivity(celtaIt);
        });

        polo = findViewById(R.id.Polo);

        polo.setOnClickListener(view -> {
            Intent poloIt = new Intent(getApplicationContext(), Polo.class);
            startActivity(poloIt);
        });

        fiesta = findViewById(R.id.Fiesta);

        fiesta.setOnClickListener(view -> {
            Intent fiestaIt = new Intent(getApplicationContext(), Fiesta.class);
            startActivity(fiestaIt);
        });


        doblo = findViewById(R.id.Doblo);

        doblo.setOnClickListener(view -> {
            Intent dobloIt = new Intent(getApplicationContext(), Doblo.class);
            startActivity(dobloIt);
        });

        escala = findViewById(R.id.Escala);

        escala.setOnClickListener(view -> {
            Intent escalaIt = new Intent(getApplicationContext(), Escala.class);
            startActivity(escalaIt);
        });

    }
}