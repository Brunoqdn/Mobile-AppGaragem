package com.example.garagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dn_bigodera.R;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Escala extends AppCompatActivity {
    ListView escalaListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escala);

        Objects.requireNonNull(getSupportActionBar()).hide();//tirar o nome do app da barra superior

        escalaListView = findViewById(R.id.escalaListView);

        getNames();
    }

    private void getNames() {
        Call<Results> call = RetrofitClient.getInstance().getMyApi().getNames();
        call.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                Results namesList = response.body();
                String[] oneNames = new String[namesList.getName().size()];
                for (int i = 0; i < namesList.getName().size(); i++) {
                    oneNames[i] = namesList.getName().get(i);
                }
                escalaListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneNames) );
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.e("TESTE", "onFailure: " + t.toString() );
                Toast.makeText(getApplicationContext(), "Ocorreu um erro", Toast.LENGTH_LONG).show();
            }
        });
    }
}