package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 25-01-2015.
 */
public class StageCell extends Activity {
    Button stgab,stgmem, stgcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stagecell);

        stgab = (Button)findViewById(R.id.stageaboutb);
        stgmem = (Button) findViewById(R.id.stagememb);
        stgcon = (Button) findViewById(R.id.stagecont);

        stgab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAbStg = new Intent("com.Abhivyakti2k15.abhishekmaurya.StageAbout");
                startActivity(openAbStg);
            }
        });

        stgmem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMeStg = new Intent("com.Abhivyakti2k15.abhishekmaurya.StageMembers");
                startActivity(openMeStg);
            }
        });
        stgcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openConStg = new Intent("com.Abhivyakti2k15.abhishekmaurya.ContactsStage");
                startActivity(openConStg);
            }
        });
    }
}
