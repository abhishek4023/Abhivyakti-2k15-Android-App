package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class ControlCell extends Activity {

    Button contrabb, contrmemb, contrcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlcell);

        contrabb = (Button) findViewById(R.id.controlaboutb);
        contrmemb = (Button) findViewById(R.id.controlmemb);
        contrcon = (Button) findViewById(R.id.controlcont);

        contrabb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openControlAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.ControlCellAbout");
                startActivity(openControlAb);
            }
        });

        contrmemb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openControlMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.ControlCellMembers");
                startActivity(openControlMem);
            }
        });
        contrcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openControlCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsControl");
                startActivity(openControlCon);
            }
        });
    }
}
