package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class Doblo extends AppCompatActivity {

    private Button conferencia_doblo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doblo);

        Objects.requireNonNull(getSupportActionBar()).hide();

        conferencia_doblo = (Button) findViewById(R.id.conferencia_doblo);

        conferencia_doblo.setOnClickListener(view -> {
            Intent conf_doblo = new Intent(getApplicationContext(), ConferenciaDoblo.class);
            startActivity(conf_doblo);
        });
    }
}