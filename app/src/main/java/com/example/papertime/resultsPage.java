package com.example.papertime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class resultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        Intent intent = getIntent();
        double message =  intent.getDoubleExtra(MainActivity.EXTRA_MESSAGE,MainActivity.timef);//get number of hours
        double days =      intent.getDoubleExtra("AVG_DAYS",MainActivity.daysf);//get avearge words per day

        TextView textView2 = findViewById(R.id.textView2);//refrences textbox on screen (we will write on it )
        TextView textView3 = findViewById(R.id.textView2);//refrences textbox on screen (we will write on it) this is for the average number per day to write

        //String messages = String.valueOf(message);//this is the number that was given by the intent in the previous activity
        String messagef ="You will need about "+String.valueOf(message)+" hours.";// message to be displayed


        String dayf= "You will need to write on average"+String.valueOf(days) +" words per day.";

        textView2.setText(messagef);//gives text box the message to write
        textView3.setText(dayf);

        Toolbar toolbar = findViewById(R.id.toolbar);//below is auto code about previous activity button on top left and pink button in bottom right
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "© 2019 Eyad Shaban", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
