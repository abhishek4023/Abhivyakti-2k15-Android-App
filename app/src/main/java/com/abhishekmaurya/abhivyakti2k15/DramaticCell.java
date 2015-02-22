package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 22-01-2015.
 */
public class DramaticCell extends Activity {

    Button dab, dem, deve, dcont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dramaticscell);

        dab = (Button) findViewById(R.id.dramaabout);
        dem = (Button) findViewById(R.id.dramamem);
        deve = (Button) findViewById(R.id.dramaevent);
        dcont = (Button) findViewById(R.id.dramacont);


        dab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutDrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.DramaAbout");
                startActivity(openAboutDrama);
            }
        });

        dem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMemDrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.DramaMember");
                startActivity(openMemDrama);
            }
        });

        deve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEveDrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.DramaEvents");
                startActivity(openEveDrama);
            }
        });
        dcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openConDrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsDramatics");
                startActivity(openConDrama);
            }
        });
    }


}
