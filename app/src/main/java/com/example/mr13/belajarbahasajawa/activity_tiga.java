package com.example.mr13.belajarbahasajawa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_tiga extends AppCompatActivity {

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        getSupportActionBar().setTitle("Aksara Carakan");;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        play = (Button)findViewById(R.id.button_ha);
        final MediaPlayer mP = MediaPlayer.create(activity_tiga.this, R.raw.hanacaraka);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mP.isPlaying()){
                    mP.pause();
                    play.setBackgroundResource(R.drawable.sound1);
                }else    {
                    mP.start();
                    play.setBackgroundResource(R.drawable.sound2);
                }
            }
        });

    }
}
