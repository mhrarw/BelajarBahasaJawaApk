package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_empat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empat);

        getSupportActionBar().setTitle("Arane Tanduran");;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
