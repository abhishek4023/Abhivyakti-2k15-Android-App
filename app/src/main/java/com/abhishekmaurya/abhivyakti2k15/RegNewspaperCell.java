package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ABHISHEK MAURYA on 28-01-2015.
 */
public class RegNewspaperCell extends Activity {


    LinearLayout l1;
    Spinner SpinnerEve, SpinnerMem;
    private String[] eventstr = {"Select Event","TAMBOLA", "BLACK AND WHITE", "TATTOO MAKING", "T-SHIRT PAINTING", "QUIZARD" };
    private String[] membstr = {"0", "1","2","3","4","5","6","7","8"};
    int mem, breakcounter=0;
    TextView bannercell, etphone, colname;
    Button regisbtn;
    final EditText[][] members = new EditText[10][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationmain);

        etphone = (TextView) findViewById(R.id.TextPhone);
        colname = (TextView) findViewById(R.id.TextColName);

        bannercell= (TextView) findViewById(R.id.bannercellname);
        bannercell.setText("NEWSPAPER CELL");

        SpinnerEve = (Spinner) findViewById(R.id.spinnerevents);   //Spinner for events
        final ArrayAdapter<String> eventAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,eventstr);
        eventAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerEve.setAdapter(eventAdapter);

        SpinnerMem = (Spinner) findViewById(R.id.spinnermember);   //Spinner for number of members
        final ArrayAdapter<String> memAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,membstr);
        memAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerMem.setAdapter(memAdapter);

        SpinnerMem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                mem= Integer.parseInt(SpinnerMem.getSelectedItem().toString());
                CreateMemList(mem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        regisbtn = (Button) findViewById(R.id.btnregis);
        regisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenumb = etphone.getText().toString();
                String Subj = SpinnerEve.getSelectedItem().toString();
                int checkspace=0;
                for(int k =0; k<mem; k++){
                    for(int p=0;p<3;p++)
                    {
                        if((members[k][p].getText().toString()).matches(""))
                        {
                            checkspace=1;
                            break;
                        }
                    }
                }

                if(Subj.equals("Select Event") || phonenumb.matches("")  || mem==0 || checkspace==1)
                {
                    Intent popu = new Intent("com.Abhivyakti2k15.abhishekmaurya.WarningPop");
                    startActivity(popu);

                }

                else {
                    String collegename = colname.getText().toString();
                    String message = "Details: \n" + " Phone Number :" + phonenumb + "\n"+ " College Name :" + collegename + "\n";

                    for (int i = 0; i < mem; i++) {
                        for (int j = 0; j < 3; j++) {
                            message = message + "\t" + members[i][j].getText().toString();
                        }

                        message = message + "\n";
                    }

                    String emailaddress[] = {"newspaper.abhivyakti2k15@gmail.com"};
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, Subj + " via Android App");
                    emailIntent.setType("plain/text");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                    startActivity(emailIntent);
                }
            }
        });

    }

    public void CreateMemList(int m)
    {

        Display display = ((WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels/5;
        LinearLayout ll = (LinearLayout)findViewById(R.id.layoutforlist);


        int wsize[] = {3*width, width, width};
        for(int i=0;i< m;i++) {
            breakcounter++;
            if(breakcounter>m)
            {
                finish();
            }
            LinearLayout l = new LinearLayout(this);
            l.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < 3; j++) {
                members[i][j] = new EditText(this);
                if(j==2) {
                    members[i][2].setInputType(InputType.TYPE_CLASS_NUMBER);
                }

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(wsize[j], LinearLayout.LayoutParams.WRAP_CONTENT);
                l.addView(members[i][j], lp);
            }
            ll.addView(l);
        }

    }

}
