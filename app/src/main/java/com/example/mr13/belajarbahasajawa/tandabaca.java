package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tandabaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tandabaca);

        getSupportActionBar().setTitle("Tanda Baca");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
