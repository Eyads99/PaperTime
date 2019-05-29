package com.example.papertime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.PaperTime.MESSAGE";
    public static double timef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Ebutton = findViewById(R.id.Ebutton);// reference to the button, named "Ebutton"

        /*Ebutton.setOnClickListener(
                new Button.OnClickListener() { //this is need to contextulise the method

                    public void onClick(View v){
                        TextView cText = findViewById(R.id.editText);

                        float x;
                        x = Integer.parseInt(cText.getText().toString());

                        double time;
                        time=x*0.09;
                    }
                }
        );*/

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, resultsPage.class);
        TextView cText = findViewById(R.id.editText);

        float x;
        x = Integer.parseInt(cText.getText().toString());

         double time;
        time=x*0.0015;
        timef=time;
        intent.putExtra(EXTRA_MESSAGE,time);
        startActivity(intent);
    }

}
