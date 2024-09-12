package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class Celta extends AppCompatActivity {

    private Button conferencia_celta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celta);

        Objects.requireNonNull(getSupportActionBar()).hide();

        conferencia_celta = (Button) findViewById(R.id.conferencia_celta);

        conferencia_celta.setOnClickListener(view -> {
            Intent conf_celta = new Intent(getApplicationContext(), ConferenciaCelta.class);
            startActivity(conf_celta);
        });
    }
}