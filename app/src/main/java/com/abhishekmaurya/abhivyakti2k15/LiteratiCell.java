package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 27-01-2015.
 */
public class LiteratiCell extends Activity {

    Button ltab,lteve,ltmem, ltcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.literaticell);

        ltab = (Button)findViewById(R.id.btlitabout);
        lteve = (Button)findViewById(R.id.btlitevent);
        ltmem = (Button) findViewById(R.id.btlitmem);
        ltcon =(Button) findViewById(R.id.btlitcont);


        ltab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openLitAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.LiteratiAbout");
                startActivity(openLitAb);
            }
        });

        lteve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openLitEv = new Intent("com.Abhivyakti2k15.abhishekmaurya.LiteratiEvents");
                startActivity(openLitEv);
            }
        });

        ltmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openLitMe = new Intent("com.Abhivyakti2k15.abhishekmaurya.LiteratiMembers");
                startActivity(openLitMe);
            }
        });
        ltcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openLitCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsLiterati");
                startActivity(openLitCon);
            }
        });
    }
}
