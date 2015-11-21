package com.example.ivanvillalobos.kcwm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Exhibit8 extends AppCompatActivity {


    MediaPlayer audio;
    int paused;

    public void playMusic (View view) {
        if(audio == null) {
            audio = MediaPlayer.create(this, R.raw.tovivaldi);
            audio.start();
        }else if(!audio.isPlaying()){
            audio.seekTo(paused);
            audio.start();
        }
    }

    public void pauseMusic(View view) {
        audio.pause();
        paused = audio.getCurrentPosition();
    }

    public void stopMusic(View view) {
        audio.release();
        audio = null;
    }






    private android.support.v7.widget.Toolbar toolbar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exhibits, menu);

        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibit8);



        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



    }


    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.navigate){
            startActivity(new Intent(this, Exhibit9.class));
            finish();

        }

        if(id==R.id.navigatePrevious){
            startActivity(new Intent(this, Exhibit7.class));
            finish();

        }

        if(id==R.id.map){
            startActivity(new Intent(this, Map.class));
            finish();

        }


        return super.onOptionsItemSelected(item);
    }

}