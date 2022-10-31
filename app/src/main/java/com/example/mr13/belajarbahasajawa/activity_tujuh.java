package com.example.mr13.belajarbahasajawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class activity_tujuh extends AppCompatActivity {

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuh);

        getSupportActionBar().setTitle("Parikan");;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
