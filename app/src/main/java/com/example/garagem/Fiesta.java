package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class Fiesta extends AppCompatActivity {

    private Button conferencia_fiesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiesta);

        Objects.requireNonNull(getSupportActionBar()).hide();

        conferencia_fiesta = (Button) findViewById(R.id.conferencia_fiesta);

        conferencia_fiesta.setOnClickListener(view -> {
            Intent conf_fiesta = new Intent(getApplicationContext(), ConferenciaFiesta.class);
            startActivity(conf_fiesta);
        });
    }
}