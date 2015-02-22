package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 22-01-2015.
 */
public class DramaMember extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dramamem);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
