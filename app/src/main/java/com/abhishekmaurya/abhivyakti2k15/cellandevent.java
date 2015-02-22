package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 19-01-2015.
 */
public class cellandevent extends Activity{

    Button musiccell, dramaticscell, stepcell, compcell, decocell, hospicell, pdccellb, stagece, ipcl, fas, handic, informc, seccel, ltbutton, newspcellb;
    Button epccellbtn, controlcellbtn, photocellbtn, infrastructurebtn, creativebtn, studentfilmbtn, mediabtn, ritbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cellandevent);


        musiccell = (Button) findViewById(R.id.music);
        dramaticscell = (Button) findViewById(R.id.drama);
        stepcell = (Button) findViewById((R.id.stepce));
        compcell = (Button) findViewById(R.id.comp);
        decocell = (Button) findViewById(R.id.decor);
        hospicell = (Button) findViewById(R.id.hosp);
        pdccellb = (Button)findViewById(R.id.pdcbutton);
        stagece = (Button) findViewById(R.id.stagebutton);
        ipcl = (Button) findViewById(R.id.internalp);
        fas = (Button) findViewById(R.id.fashion);
        handic = (Button) findViewById(R.id.handi);
        informc = (Button) findViewById(R.id.informalce);
        seccel = (Button) findViewById(R.id.securityntb);
        ltbutton = (Button) findViewById(R.id.litera);
        newspcellb = (Button) findViewById(R.id.newsbtn);
        epccellbtn = (Button) findViewById(R.id.externalp);
        controlcellbtn = (Button) findViewById(R.id.controlcbt);
        photocellbtn = (Button) findViewById(R.id.photobtn);
        infrastructurebtn = (Button) findViewById(R.id.infrabtn);
        creativebtn = (Button) findViewById(R.id.creativebt);
        studentfilmbtn = (Button) findViewById(R.id.stufilm);
        mediabtn = (Button) findViewById(R.id.mediabt);
        ritbtn = (Button) findViewById(R.id.ritumbtn);

        musiccell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutMusic = new Intent("com.Abhivyakti2k15.abhishekmaurya.musiccell");
                startActivity(openAboutMusic);
            }
        });

        dramaticscell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutdrama = new Intent("com.Abhivyakti2k15.abhishekmaurya.DramaticCell");
                startActivity(openAboutdrama);
            }
        });

        stepcell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutstep = new Intent("com.Abhivyakti2k15.abhishekmaurya.StepCell");
                startActivity(openAboutstep);
            }
        });

        compcell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutcompe = new Intent("com.Abhivyakti2k15.abhishekmaurya.ComperingCell");
                startActivity(openAboutcompe);
            }
        });

        decocell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutcompe = new Intent("com.Abhivyakti2k15.abhishekmaurya.DecorationCell");
                startActivity(openAboutcompe);
            }
        });

        hospicell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutHospit = new Intent("com.Abhivyakti2k15.abhishekmaurya.HospitalityCell");
                startActivity(openAboutHospit);
            }
        });

        pdccellb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutHospit = new Intent("com.Abhivyakti2k15.abhishekmaurya.PdcCell");
                startActivity(openAboutHospit);
            }
        });

        stagece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutHospit = new Intent("com.Abhivyakti2k15.abhishekmaurya.StageCell");
                startActivity(openAboutHospit);
            }
        });



        ipcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutIpcl = new Intent("com.Abhivyakti2k15.abhishekmaurya.IpcCell");
                startActivity(openAboutIpcl);
            }
        });

        fas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFas = new Intent("com.Abhivyakti2k15.abhishekmaurya.FashionCell");
                startActivity(openFas);
            }
        });

        handic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHan = new Intent("com.Abhivyakti2k15.abhishekmaurya.HandicraftCell");
                startActivity(openHan);
            }
        });

        informc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInform = new Intent("com.Abhivyakti2k15.abhishekmaurya.InfromalCell");
                startActivity(openInform);
            }
        });

        seccel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSeccel = new Intent("com.Abhivyakti2k15.abhishekmaurya.SecurityCell");
                startActivity(openSeccel);
            }
        });

        ltbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openLit = new Intent("com.Abhivyakti2k15.abhishekmaurya.LiteratiCell");
                startActivity(openLit);
            }
        });

        newspcellb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNewsp = new Intent("com.Abhivyakti2k15.abhishekmaurya.NewspaperCell");
                startActivity(openNewsp);
            }
        });
        epccellbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEpc = new Intent("com.Abhivyakti2k15.abhishekmaurya.EpcCell");
                startActivity(openEpc);
            }
        });

        controlcellbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openControlc = new Intent("com.Abhivyakti2k15.abhishekmaurya.ControlCell");
                startActivity(openControlc);
            }
        });

        photocellbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhoto = new Intent("com.Abhivyakti2k15.abhishekmaurya.PhotoCell");
                startActivity(openPhoto);
            }
        });

        infrastructurebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhoto = new Intent("com.Abhivyakti2k15.abhishekmaurya.InfraCell");
                startActivity(openPhoto);
            }
        });

        creativebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCre = new Intent("com.Abhivyakti2k15.abhishekmaurya.CreativeCell");
                startActivity(openCre);
            }
        });

        studentfilmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStuFilm = new Intent("com.Abhivyakti2k15.abhishekmaurya.SfsCell");
                startActivity(openStuFilm);
            }
        });

        mediabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMediaC = new Intent("com.Abhivyakti2k15.abhishekmaurya.Mediacell");
                startActivity(openMediaC);
            }
        });

        ritbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRitumC = new Intent("com.Abhivyakti2k15.abhishekmaurya.RitumCell");
                startActivity(openRitumC);
            }
        });


    }



}
