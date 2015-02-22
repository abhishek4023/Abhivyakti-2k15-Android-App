package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 25-01-2015.
 */
public class IpcCell extends Activity {

    Button ipca, ipce, ipcm, ipcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ipccell);

        ipca = (Button) findViewById(R.id.ipcaboutbt);
        ipce = (Button) findViewById(R.id.ipceventbt);
        ipcm = (Button) findViewById(R.id.ipcmembt);
        ipcon = (Button) findViewById(R.id.ipccontbt);

        ipca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIpcAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.IpcAbout");
                startActivity(openIpcAb);
            }
        });
        ipce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIpcEv = new Intent("com.Abhivyakti2k15.abhishekmaurya.IpcEvents");
                startActivity(openIpcEv);
            }
        });
        ipcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIpcMe = new Intent("com.Abhivyakti2k15.abhishekmaurya.IpcMembers");
                startActivity(openIpcMe);
            }
        });
        ipcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIpcCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsIpc");
                startActivity(openIpcCon);
            }
        });


    }
}
