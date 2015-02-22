package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ABHISHEK MAURYA on 31-01-2015.
 */
public class ContactsInformal extends Activity {
    TextView txtcont, txtemail;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactsallcells);

        la1 = (LinearLayout) findViewById(R.id.layoutcontact);
        la1.setBackgroundResource(R.drawable.f5);


        String s = "Rachit Tandon " + "[Coordinator]\n" + "8175919996\n\n" + "Rohan Talwar " + "[Coordinator]\n" + "8953876665\n\n";
        s=s+ "Rishabh Rastogi " + "[Coordinator]\n" + "8960677343\n\n"+ "Shivam Singh " + "[Organiser]\n" + "9198435880";
        txtcont = (TextView) findViewById(R.id.contacttxt);
        txtcont.setText(s);

        String e = "informal.abhivyakti2k15@gmail.com";
        txtemail = (TextView) findViewById(R.id.emailtxt);
        txtemail.setText(e);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
