package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class CreativeCell extends Activity {

    Button creab, cremem, creeve, crecon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creativecanvascell);

        creab = (Button) findViewById(R.id.creativeaboutbt);
        cremem = (Button) findViewById(R.id.creativemembt);
        creeve = (Button) findViewById(R.id.creativeeventbt);
        crecon = (Button) findViewById(R.id.creativeconbt);


        creab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCreAb = new Intent("com.Abhivyakti2k15.abhishekmaurya.CreativeAbout");
                startActivity(openCreAb);
            }
        });
        cremem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCreMem = new Intent("com.Abhivyakti2k15.abhishekmaurya.CreativeMembers");
                startActivity(openCreMem);
            }
        });
        creeve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCreEve = new Intent("com.Abhivyakti2k15.abhishekmaurya.CreativeEvents");
                startActivity(openCreEve);
            }
        });
        crecon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCreCon = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsCanvas");
                startActivity(openCreCon);
            }
        });
    }
}
