package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class InfromalCell extends Activity {

    Button inab, inme, inev, incon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informalcell);

        inab = (Button) findViewById(R.id.btninforab);
        inme = (Button) findViewById(R.id.btninformem);
        inev = (Button) findViewById(R.id.btninforeve);
        incon = (Button) findViewById(R.id.btninforcont);

        inab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInformAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.InformalAbout");
                startActivity(openInformAb);
            }
        });
        inme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInformMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.InformalMembers");
                startActivity(openInformMem);
            }
        });
        inev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInformEv = new Intent("com.Abhivyakti2k15.abhishekmaurya.InformalEvents");
                startActivity(openInformEv);
            }
        });
        incon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInformCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsInformal");
                startActivity(openInformCon);
            }
        });
    }
}
