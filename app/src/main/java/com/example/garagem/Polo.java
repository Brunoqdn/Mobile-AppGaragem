package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.dn_bigodera.R;

import java.util.Objects;

public class Polo extends AppCompatActivity {

    private Button conferencia_polo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polo);

        Objects.requireNonNull(getSupportActionBar()).hide();

        conferencia_polo = (Button) findViewById(R.id.conferencia_polo);

        conferencia_polo.setOnClickListener(view -> {
            Intent conf_polo = new Intent(getApplicationContext(), ConferenciaPolo.class);
            startActivity(conf_polo);
        });
    }
}