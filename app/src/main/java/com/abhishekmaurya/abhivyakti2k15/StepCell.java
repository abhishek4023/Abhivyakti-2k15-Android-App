package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 24-01-2015.
 */
public class StepCell extends Activity {

    Button stepab, stepme, stepev, stepco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepcell);

        stepab = (Button) findViewById(R.id.stepabout);
        stepme = (Button) findViewById(R.id.stepmem);
        stepev = (Button) findViewById(R.id.stepevent);
        stepco = (Button) findViewById(R.id.stepcont);


        stepab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStepAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.StepAbout");
                startActivity(openStepAbout);
            }
        });

        stepme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStepMemb = new Intent("com.Abhivyakti2k15.abhishekmaurya.StepMembers");
                startActivity(openStepMemb);
            }
        });

        stepev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStepEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.StepEvents");
                startActivity(openStepEve);
            }
        });

        stepco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStepCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsStep");
                startActivity(openStepCon);
            }
        });
    }
}
