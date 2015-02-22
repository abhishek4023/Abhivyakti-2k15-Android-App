package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ABHISHEK MAURYA on 19-01-2015.
 */
public class queries extends Activity {

    Button btn;
    EditText mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queries);
        mes = (EditText) findViewById(R.id.etEmail);
        btn = (Button) findViewById(R.id.btnsend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = mes.getText().toString();
                String emailaddress[] = { "abhivyakti@srmcem.ac.in" };
                String message = "Query ::  \n" + msg ;

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Query via  Abhivyakti ANDROID App");
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_TEXT,message);
                startActivity(emailIntent);

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
