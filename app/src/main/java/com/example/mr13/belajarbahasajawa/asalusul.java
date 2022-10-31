package com.example.mr13.belajarbahasajawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class asalusul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asalusul);

        getSupportActionBar().setTitle("Aksara Jawa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void carakan(View view) {
        Intent intent = new Intent(asalusul.this, activity_tiga.class);
        startActivity(intent);
    }

    public void pasangan(View view) {
        Intent intent = new Intent(asalusul.this, pasangan.class);
        startActivity(intent);
    }

    public void sandangan(View view) {
        Intent intent = new Intent(asalusul.this, sandangan.class);
        startActivity(intent);
    }

    public void akswara(View view) {
        Intent intent = new Intent(asalusul.this, akswara.class);
        startActivity(intent);
    }

    public void akrekan(View view) {
        Intent intent = new Intent(asalusul.this, akrekan.class);
        startActivity(intent);
    }

    public void akmurda(View view) {
        Intent intent = new Intent(asalusul.this, akmurda.class);
        startActivity(intent);
    }

    public void akwilangan(View view) {
        Intent intent = new Intent(asalusul.this, akwilangan.class);
        startActivity(intent);
    }

    public void tandabc(View view) {
        Intent intent = new Intent(asalusul.this, tandabaca.class);
        startActivity(intent);
    }

    public void contohpe(View view) {
        Intent intent = new Intent(asalusul.this, penulisan.class);
        startActivity(intent);
    }
}
