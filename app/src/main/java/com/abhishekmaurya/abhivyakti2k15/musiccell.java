package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 19-01-2015.
 */
public class musiccell extends Activity {

     Button ab,musicme, musicev, musicco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musiccell);

        ab = (Button) findViewById(R.id.musicabout);
        musicme = (Button) findViewById(R.id.musicmem);
        musicev = (Button) findViewById(R.id.muzikevent);
        musicco = (Button) findViewById(R.id.muzikcont);


        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutMusic = new Intent("com.Abhivyakti2k15.abhishekmaurya.musicabout");
                startActivity(openAboutMusic);
            }
        });

        musicme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.musicmember");
                startActivity(openAboutMem);
            }
        });

        musicev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMusicEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.musicevent");
                startActivity(openMusicEve);
            }
        });
        musicco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMusicCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsMusic");
                startActivity(openMusicCon);
            }
        });



    }
}
