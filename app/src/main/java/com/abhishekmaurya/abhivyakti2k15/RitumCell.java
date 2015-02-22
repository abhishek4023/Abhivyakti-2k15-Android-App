package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 05-02-2015.
 */
public class RitumCell extends Activity {
    Button ritmem,ritab, ritcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ritumcell);

        ritab = (Button) findViewById(R.id.ritumaboutbt);
        ritmem = (Button) findViewById(R.id.ritummemb);


        ritmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenDesMember = new Intent("com.Abhivyakti2k15.abhishekmaurya.RitumMem");
                startActivity(OpenDesMember);
            }
        });
        ritab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenDesAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.RitumAbout");
                startActivity(OpenDesAbout);
            }
        });



    }

}
