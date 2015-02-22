package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 24-01-2015.
 */
public class ComperingCell extends Activity {

    Button compab, compmem, compcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comperingcell);

        compab = (Button) findViewById(R.id.comperabout);
        compmem = (Button) findViewById(R.id.compermem);
        compcont = (Button) findViewById(R.id.compercont);

        compab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openComperAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.ComperingAbout");
                startActivity(openComperAbout);
            }
        });

        compmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openComperMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.ComperingMem");
                startActivity(openComperMem);
            }
        });

        compcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openComperCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsCompering");
                startActivity(openComperCon);
            }
        });
    }
}
