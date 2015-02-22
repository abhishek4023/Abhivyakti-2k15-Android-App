package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 29-01-2015.
 */
public class EpcCellAbout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.epcabout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
