package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ABHISHEK MAURYA on 01-02-2015.
 */
public class Kunal extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        Button sk;
        final int[] count = new int[1];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunal);
        count[0]=0;
        sk = (Button) findViewById(R.id.btnskip);
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0] =1;
                Intent openMainActivity = new Intent("com.Abhivyakti2k15.abhishekmaurya.Abhivyakti");
                startActivity(openMainActivity);

            }
        });

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);

                } catch(InterruptedException e){
                    e.printStackTrace();

                }finally {
                    if(count[0] !=1) {
                        Intent openMainActivity = new Intent("com.Abhivyakti2k15.abhishekmaurya.Abhivyakti");
                        startActivity(openMainActivity);
                    }

                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }
}
