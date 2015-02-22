package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 25-01-2015.
 */
public class PdcCell extends Activity {

    Button pa, pm, pc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdccell);

        pa = (Button) findViewById(R.id.pdcaboutb);
        pm = (Button) findViewById(R.id.pdcmemb);
        pc = (Button) findViewById(R.id.pdccont);

        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAbPdc = new Intent("com.Abhivyakti2k15.abhishekmaurya.PdcAbout");
                startActivity(openAbPdc);
            }
        });

        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMePdc = new Intent("com.Abhivyakti2k15.abhishekmaurya.PdcMembers");
                startActivity(openMePdc);
            }
        });


        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCOnPdc = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsPdc");
                startActivity(openCOnPdc);
            }
        });



    }
}
