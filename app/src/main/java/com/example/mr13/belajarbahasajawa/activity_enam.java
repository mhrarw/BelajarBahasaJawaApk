package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_enam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enam);

        getSupportActionBar().setTitle("Paribasan Jawa");;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
