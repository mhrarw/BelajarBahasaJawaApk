package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_lima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima);

        getSupportActionBar().setTitle("Kosok Balen");;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
