package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 25-01-2015.
 */
public class HospitalityCell extends Activity {

    Button hab,hem,hco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospitalitycell);

        hab = (Button) findViewById(R.id.hospitabout);
        hem = (Button) findViewById(R.id.hospitmem);
        hco = (Button) findViewById(R.id.hospitcont);


        hab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHospAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.HospitalityAbout");
                startActivity(openHospAbout);
            }
        });
        hem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHospMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.HospitalityMembers");
                startActivity(openHospMem);
            }
        });
        hco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHospCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsHospitality");
                startActivity(openHospCon);
            }
        });


    }
}
