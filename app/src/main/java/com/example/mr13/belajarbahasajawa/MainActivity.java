package com.example.mr13.belajarbahasajawa;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.AlertDialog;
import android.support.v7.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        //Set event
        SetSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void SetSingleEvent(GridLayout mainGrid) {
        for (int i =0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if (finalI == 0) // activity satu
                    {
                        Intent intent = new Intent(MainActivity.this, activity_satu.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1) // activity dua
                    {
                        Intent intent = new Intent(MainActivity.this, activity_dua.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2) // activity tiga
                    {
                        Intent intent = new Intent(MainActivity.this, asalusul.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3) // activity empat
                    {
                        Intent intent = new Intent(MainActivity.this, activity_empat.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4) // activity lima
                    {
                        Intent intent = new Intent(MainActivity.this, activity_lima.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5) // activity enam
                    {
                        Intent intent = new Intent(MainActivity.this, activity_enam.class);
                        startActivity(intent);
                    }
                    else if (finalI == 6) // activity tujuh
                    {
                        Intent intent = new Intent(MainActivity.this, activity_tujuh.class);
                        startActivity(intent);
                    }
                    else if (finalI == 7) // activity 8
                    {
                        Intent intent = new Intent(MainActivity.this, activity_delapan.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Please set activity for this card item", Toast.LENGTH_LONG);
                    }
                }


        });
    }
}
    @Override
    public void onBackPressed(){
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Tutup aplikasi ini?")
                .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}