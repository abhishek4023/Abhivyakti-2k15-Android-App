package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class RegistrationSelectCell extends Activity {

    Button stepregbt, musicregbt, dramaticsregbt, literatiregbt, informalregbt, handicraftregbt, newspaperregbt, photoregbt, canvasregbt, howtobt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationselectcell);

        stepregbt = (Button)findViewById(R.id.btregstep);
        musicregbt = (Button) findViewById(R.id.btregmusic);
        dramaticsregbt = (Button) findViewById(R.id.btregdramatics);
        literatiregbt = (Button) findViewById(R.id.btregliterati);
        informalregbt = (Button) findViewById(R.id.btreginformal);
        handicraftregbt = (Button) findViewById(R.id.btreghandicraft);
        newspaperregbt = (Button) findViewById(R.id.btregnewspaper);
        photoregbt = (Button) findViewById(R.id.btregphoto);
        canvasregbt = (Button) findViewById(R.id.btregcreativecanvas);
        howtobt = (Button) findViewById(R.id.bthowtoreg);


        stepregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterStep = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegStepCell");
                startActivity(RegisterStep);
            }
        });

        musicregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterMusic = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegMusicCell");
                startActivity(RegisterMusic);
            }
        });

        dramaticsregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterDrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegDramaticsCell");
                startActivity(RegisterDrama);
            }
        });

        literatiregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterLit = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegLiterattiCell");
                startActivity(RegisterLit);
            }
        });

        informalregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterInformal = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegInformalCell");
                startActivity(RegisterInformal);
            }
        });

        handicraftregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterHandi = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegHandicraftCell");
                startActivity(RegisterHandi);
            }
        });

        newspaperregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterNewsp = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegNewspaperCell");
                startActivity(RegisterNewsp);
            }
        });

        photoregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterPhoto = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegPhotoCell");
                startActivity(RegisterPhoto);
            }
        });
        canvasregbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterCanvas = new Intent("com.Abhivyakti2k15.abhishekmaurya.RegCanvasCell");
                startActivity(RegisterCanvas);
            }
        });
        howtobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HowtoOpen = new Intent("com.Abhivyakti2k15.abhishekmaurya.HowToReg");
                startActivity(HowtoOpen);
            }
        });
    }


}
