package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sandangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandangan);

        getSupportActionBar().setTitle("Sandangan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
