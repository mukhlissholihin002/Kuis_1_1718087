package com.example.kuis_1_1718087;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private keluarga_adapter keluargaAdapter;
    private ArrayList<keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new keluarga_adapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("IMAM MUSLIM", "Ayah",  getDrawable(R.drawable.ayah)));
        keluargaArrayList.add(new keluarga("SRI LESTARI", "Ibu", getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new keluarga("MUKHLIS SHOLIHIN", "Anak Pertama", getDrawable(R.drawable.aku)));
        keluargaArrayList.add(new keluarga("ALDILA LAILI KHOIRIYAH", "Anak Kedua", getDrawable(R.drawable.adik)));
    }
}
