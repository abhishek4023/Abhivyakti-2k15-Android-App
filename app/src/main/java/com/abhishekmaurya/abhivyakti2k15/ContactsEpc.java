package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ABHISHEK MAURYA on 31-01-2015.
 */
public class ContactsEpc extends Activity {
    TextView txtcont, txtemail;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactsallcells);

        la1 = (LinearLayout) findViewById(R.id.layoutcontact);
        la1.setBackgroundResource(R.drawable.f1);


       //// String s = "Aman Mishra " + "[Coordinator]\n" + "8188908897\n\n" + "Somya Singh " + "[Coordinator]\n" + "9532757850";
        txtcont = (TextView) findViewById(R.id.contacttxt);
       // txtcont.setText(s);
        txtcont.setVisibility(View.GONE);

        String e = "epc.abhivyakti2k15@gmail.com";
        txtemail = (TextView) findViewById(R.id.emailtxt);
        txtemail.setText(e);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
