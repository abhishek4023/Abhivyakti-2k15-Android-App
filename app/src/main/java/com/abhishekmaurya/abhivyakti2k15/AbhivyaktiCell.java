package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 28-01-2015.
 */
public class AbhivyaktiCell extends Activity {

    Button abhabbtn, orgcom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abhvyakticell);

        abhabbtn = (Button) findViewById(R.id.abhivyaktiaboutb);
        orgcom = (Button) findViewById(R.id.abhivyaktimemb);

        abhabbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenAbAbhi = new Intent("com.Abhivyakti2k15.abhishekmaurya.abhivabout");
                startActivity(OpenAbAbhi);
            }
        });

        orgcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OpenAbMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.OrganizingComitee");
                startActivity(OpenAbMem);
            }
        });
    }

}
