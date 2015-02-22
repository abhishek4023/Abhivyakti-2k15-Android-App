package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 27-01-2015.
 */
public class SecurityCell extends Activity {

    Button secab,secmem, seccont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.securitycell);

        secab = (Button) findViewById(R.id.secureaboutb);
        secmem = (Button) findViewById(R.id.securememb);
        seccont = (Button) findViewById(R.id.securecont);

        secab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSecurAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.SecurityCellAbout");
                startActivity(openSecurAbout);
            }
        });

        secmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSecurAbout = new Intent("com.Abhivyakti2k15.abhishekmaurya.SecurityCellMembers");
                startActivity(openSecurAbout);
            }
        });
        seccont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSecurCont = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsSecurity");
                startActivity(openSecurCont);
            }
        });
    }
}
