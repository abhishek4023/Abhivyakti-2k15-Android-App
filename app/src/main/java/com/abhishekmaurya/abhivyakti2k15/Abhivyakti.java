package com.abhishekmaurya.abhivyakti2k15;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class Abhivyakti extends ActionBarActivity {

    Button abhivyakti, que, exit, cellandeve , notify, results, registrationcellmenu, schedulefr, speceve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abhivyakti);

        abhivyakti = (Button)findViewById(R.id.abhiv);
        que = (Button) findViewById(R.id.queries);
        exit= (Button) findViewById(R.id.exit);
        cellandeve=(Button) findViewById(R.id.cells);
        notify = (Button) findViewById(R.id.not);
        results = (Button) findViewById(R.id.results);
        registrationcellmenu = (Button) findViewById(R.id.reg);
        schedulefr = (Button) findViewById(R.id.sch);
        speceve = (Button)findViewById(R.id.btnspevents);


        abhivyakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent openAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.AbhivyaktiCell");
                    startActivity(openAbout);
            }
        });


        que.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openQuery = new Intent("com.Abhivyakti2k15.abhishekmaurya.queries");
                startActivity(openQuery);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        cellandeve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCell = new Intent("com.Abhivyakti2k15.abhishekmaurya.cellandevent");
                startActivity(openCell);
            }
        });

        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNotify = new Intent("com.Abhivyakti2k15.abhishekmaurya.Notification");
                startActivity(openNotify);
            }
        });

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openResults = new Intent("com.Abhivyakti2k15.abhishekmaurya.Results");
                startActivity(openResults);
            }
        });

        registrationcellmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRegis = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegistrationSelectCell");
                startActivity(openRegis);
            }
        });

        schedulefr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSched = new Intent("com.Abhivyakti2k15.abhishekmaurya.ScheduleMain");
                startActivity(openSched);
            }
        });

        speceve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSpev = new Intent("com.Abhivyakti2k15.abhishekmaurya.SpecialEvents");
                startActivity(openSpev);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_abhivyakti, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {   //My Information

            Intent openMyDetail = new Intent("com.Abhivyakti2k15.abhishekmaurya.MyDetail");
            startActivity(openMyDetail);
            return true;
        }

        if (id == R.id.action_disclaimer) {
            Intent openDisclaimer = new Intent("com.Abhivyakti2k15.abhishekmaurya.DisclaimerFr");
            startActivity(openDisclaimer);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
