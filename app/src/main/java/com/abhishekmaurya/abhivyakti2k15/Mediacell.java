package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 30-01-2015.
 */
public class Mediacell extends Activity {

    Button mediamembt, mediaconbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mediacell);

        mediamembt = (Button) findViewById(R.id.mediamemb);
        mediaconbt = (Button) findViewById(R.id.mediacont);

        mediamembt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenMediaC = new Intent("com.Abhivyakti2k15.abhishekmaurya.MediaMembers");
                startActivity(OpenMediaC);
            }
        });
        mediaconbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenMediaCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsMedia");
                startActivity(OpenMediaCon);
            }
        });
    }
}
