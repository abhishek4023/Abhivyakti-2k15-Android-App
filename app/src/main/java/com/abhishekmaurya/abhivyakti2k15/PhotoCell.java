package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class PhotoCell extends Activity {

    Button Photab, Photmem, Photeve, Photocon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photographycell);

        Photab = (Button)findViewById(R.id.photoaboutb);
        Photmem = (Button) findViewById(R.id.photomemb);
        Photeve = (Button) findViewById(R.id.photoeventb);
        Photocon = (Button) findViewById(R.id.photoconttb);


        Photab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhotoAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.PhotoAbout");
                startActivity(openPhotoAb);

            }
        });

        Photmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhotoMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.PhotoMembers");
                startActivity(openPhotoMem);

            }
        });

        Photeve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhotoEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.PhotoEvents");
                startActivity(openPhotoEve);

            }
        });
        Photocon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhotoCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsPhoto");
                startActivity(openPhotoCon);

            }
        });
    }
}
