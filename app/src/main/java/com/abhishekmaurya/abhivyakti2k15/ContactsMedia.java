package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ABHISHEK MAURYA on 31-01-2015.
 */
public class ContactsMedia extends Activity {
    TextView txtcont, txtemail;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactsallcells);

        la1 = (LinearLayout) findViewById(R.id.layoutcontact);
        la1.setBackgroundResource(R.drawable.f2);


        String s = "Email:";
        txtcont = (TextView) findViewById(R.id.contacttxt);
        txtcont.setText(s);
        txtcont.setVisibility(View.GONE);

        String e = "media.abhivyakti2k15@gmail.com";
        txtemail = (TextView) findViewById(R.id.emailtxt);
        txtemail.setText(e);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
