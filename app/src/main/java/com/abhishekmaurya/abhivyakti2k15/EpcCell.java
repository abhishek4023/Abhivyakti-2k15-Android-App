package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class EpcCell extends Activity {

    Button epcab, epcmem, epccon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.epccell);

        epcab = (Button) findViewById(R.id.epcaboutb);
        epcmem = (Button) findViewById(R.id.epcmemb);
        epccon = (Button) findViewById(R.id.epccont);


        epcab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEpcAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.EpcCellAbout");
                startActivity(openEpcAb);
            }
        });

        epcmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEpcMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.EpcCellMembers");
                startActivity(openEpcMem);
            }
        });
        epccon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEpcCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsEpc");
                startActivity(openEpcCon);
            }
        });

    }
}
