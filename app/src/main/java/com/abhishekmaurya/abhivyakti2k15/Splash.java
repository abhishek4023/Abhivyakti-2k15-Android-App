package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 17-01-2015.
 */
public class Splash extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);

                } catch(InterruptedException e){
                    e.printStackTrace();

                }finally {
                    Intent openMainActivity = new Intent("com.Abhivyakti2k15.abhishekmaurya.Kunal");
                    startActivity(openMainActivity);

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
