package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class HandicraftCell extends Activity {

    Button handab, handmem, handeve, handcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handicraftcell);

        handab = (Button) findViewById(R.id.btnhandiab);
        handmem = (Button) findViewById(R.id.btnhandimem);
        handeve = (Button) findViewById(R.id.btnhandieve);
        handcont = (Button) findViewById(R.id.btnhandicont);


        handab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenHandAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.HandicraftAbout");
                startActivity(OpenHandAbout);
            }
        });

        handmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenHandMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.HandicraftMembers");
                startActivity(OpenHandMem);
            }
        });

        handeve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenHandEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.HandicraftsEvents");
                startActivity(OpenHandEve);
            }
        });
        handcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenHandCont = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsHandicraft");
                startActivity(OpenHandCont);
            }
        });

    }


}
