package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 28-01-2015.
 */
public class NewspaperCell extends Activity {

    Button newab, neweve, newmem, necon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newspapercell);

        newab = (Button) findViewById(R.id.nwsaboutb);
        neweve = (Button) findViewById(R.id.nwsevent);
        newmem = (Button) findViewById(R.id.nwsmemb);
        necon = (Button) findViewById(R.id.nwscontact);

        newab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenNewsAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.NewspaperAbout");
                startActivity(OpenNewsAbout);
            }
        });

        neweve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenNewsEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.NewspaperEvent");
                startActivity(OpenNewsEve);
            }
        });

        newmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenNewsMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.NewspaperMembers");
                startActivity(OpenNewsMem);
            }
        });
        necon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenNewsCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsNewspaper");
                startActivity(OpenNewsCon);
            }
        });
    }
}
