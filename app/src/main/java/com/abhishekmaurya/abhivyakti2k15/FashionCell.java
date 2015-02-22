package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 25-01-2015.
 */
public class FashionCell extends Activity {

    Button fasha, fashm, fashc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashioncell);

        fasha = (Button) findViewById(R.id.fashionaboutbt);
        fashm = (Button) findViewById(R.id.fashionmembt);
        fashc = (Button) findViewById(R.id.fashioncont);


        fasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFasAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.FashionAbout");
                startActivity(openFasAbout);
            }
        });

        fashm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFasMemb = new Intent("com.Abhivyakti2k15.abhishekmaurya.FashionMembers");
                startActivity(openFasMemb);
            }
        });
        fashc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFasCont = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsFashion");
                startActivity(openFasCont);
            }
        });
    }
}
