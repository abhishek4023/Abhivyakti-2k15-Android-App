package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 24-01-2015.
 */
public class DecorationCell extends Activity {

    Button decoab, decomem, decocon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decorationcell);

    decoab = (Button) findViewById(R.id.decabo);
        decomem = (Button) findViewById(R.id.decmem);
        decocon = (Button) findViewById(R.id.decconta);

        decoab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDecorAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.DecorationAbout");
                startActivity(openDecorAbout);
            }
        });

        decomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDecorMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.DecorationMember");
                startActivity(openDecorMem);
            }
        });

        decocon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDecorCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsDecoration");
                startActivity(openDecorCon);
            }
        });

    }
}
