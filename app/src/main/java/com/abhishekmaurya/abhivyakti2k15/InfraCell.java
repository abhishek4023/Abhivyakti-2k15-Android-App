package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class InfraCell extends Activity {

    Button infraAb, inframem, infracont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infracell);

        infraAb = (Button) findViewById(R.id.infraaboutb);
        inframem = (Button) findViewById(R.id.inframemb);
        infracont = (Button) findViewById(R.id.infracont);

        infraAb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInfraAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.InfraAbout");
                startActivity(openInfraAb);
            }
        });

        inframem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInfraMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.InfraMembers");
                startActivity(openInfraMem);
            }
        });
        infracont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInfraCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsInfra");
                startActivity(openInfraCon);
            }
        });
    }

}
