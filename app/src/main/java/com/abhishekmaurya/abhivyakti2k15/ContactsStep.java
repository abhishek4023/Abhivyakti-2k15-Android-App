package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ABHISHEK MAURYA on 31-01-2015.
 */
public class ContactsStep extends Activity {


    TextView txtcont, txtemail;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactsallcells);

        la1 = (LinearLayout) findViewById(R.id.layoutcontact);
        la1.setBackgroundResource(R.drawable.f2);


        String s = "Prerit Saxena " + "[Coordinator]\n" + "8004472055\n\n" + "Pranav Shukla " + "[Coordinator]\n" + "7376656040";
        txtcont = (TextView) findViewById(R.id.contacttxt);
        txtcont.setText(s);

        String e = "choreography.abhivyakti2k15@gmail.com";
        txtemail = (TextView) findViewById(R.id.emailtxt);
        txtemail.setText(e);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
