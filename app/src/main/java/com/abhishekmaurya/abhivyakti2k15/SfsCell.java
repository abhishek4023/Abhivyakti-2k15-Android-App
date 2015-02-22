package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class SfsCell extends Activity {

Button sfsa, sfsm, sfsf, sfscon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sfscell);

        sfsa = (Button) findViewById(R.id.sfsaboutb);
        sfsm = (Button) findViewById(R.id.sfsmembbt);
        sfsf = (Button) findViewById(R.id.sfsschbt);
        sfscon = (Button) findViewById(R.id.sfssconbt);

        sfsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStuFilmAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.SfsCellAbout");
                startActivity(openStuFilmAb);
            }
        });

        sfsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStuFilmMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.SfsCellMembers");
                startActivity(openStuFilmMem);
            }
        });

        sfsf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStuFilmFil = new Intent("com.Abhivyakti2k15.abhishekmaurya.SfsFilm");
                startActivity(openStuFilmFil);
            }
        });
        sfscon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStuFilmCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsSfs");
                startActivity(openStuFilmCon);
            }
        });
    }
}
