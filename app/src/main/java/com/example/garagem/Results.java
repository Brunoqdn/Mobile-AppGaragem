package com.example.garagem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results{

    @SerializedName("nomes")
    private List<String> nomes;

    public Results(List<String> names) {
        this.nomes = names;
    }

    public List<String> getName() {
        return nomes;
    }
}