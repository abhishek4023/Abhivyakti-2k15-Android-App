package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class SpecialEvents extends Activity {

    Button strntb, xerob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specialevents);

        strntb = (Button) findViewById(R.id.btnstarnyt);
        xerob = (Button) findViewById(R.id.btnxero);

        strntb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenStrNyt = new Intent("com.Abhivyakti2k15.abhishekmaurya.StarNightAbout");
                startActivity(OpenStrNyt);
            }
        });

        xerob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenXero = new Intent("com.Abhivyakti2k15.abhishekmaurya.XeroAbout");
                startActivity(OpenXero);
            }
        });
    }
}
