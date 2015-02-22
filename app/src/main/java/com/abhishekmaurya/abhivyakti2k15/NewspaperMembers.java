package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 30-01-2015.
 */
public class NewspaperMembers extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newspapermembers);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
