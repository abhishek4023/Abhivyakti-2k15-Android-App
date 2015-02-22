package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class ScheduleMain extends Activity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedulemain);

        b1 = (Button) findViewById(R.id.btnday1);
        b2= (Button) findViewById(R.id.btnday2);
        b3= (Button) findViewById(R.id.btnday3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenDay1 = new Intent("com.Abhivyakti2k15.abhishekmaurya.Day1");
                startActivity(OpenDay1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenDay2 = new Intent("com.Abhivyakti2k15.abhishekmaurya.Day2");
                startActivity(OpenDay2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenDay3 = new Intent("com.Abhivyakti2k15.abhishekmaurya.Day3");
                startActivity(OpenDay3);
            }
        });
    }
}
