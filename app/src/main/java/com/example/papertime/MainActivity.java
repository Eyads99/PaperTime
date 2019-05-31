package com.example.papertime;

import android.content.Intent;//imported librabries
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.PaperTime.MESSAGE";// this is given to the intent
    public static double timef;
    @Override
    protected void onCreate(Bundle savedInstanceState)// this is what happens when the app is created (refrence andriod app lifecycle for more info)
    {
        super.onCreate(savedInstanceState);//auto created code
        setContentView(R.layout.activity_main);//sets layout of the intial acticity

        Button Ebutton = findViewById(R.id.Ebutton);// reference to the button, named "Ebutton"

        /*Ebutton.setOnClickListener( //ignore
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
        TextView cText = findViewById(R.id.editText);//this is how we refrence the number that was inputed
       // TextView rText=findViewById(R.id.checkBox);
        //TextView pText=findViewById(R.id.checkBoxPlan);

        CheckBox rTexts= findViewById(R.id.checkBox);//refrences the research checkbox
        CheckBox pTexts= findViewById(R.id.checkBoxPlan);//refrences the plan checkbox

        boolean research=rTexts.isChecked();//sees if the resreach check box is ticked or not
        boolean plan=pTexts.isChecked();//sees if the plan check box is ticked or not


        float x = Integer.parseInt(cText.getText().toString());//gets the inputed number and turns it into a float
        /*boolean research=Boolean.getBoolean(String.valueOf(rText.getText()));
        boolean plan=Boolean.getBoolean(String.valueOf(pText.getText()));
*/
         double time;//this is the total amount of time expected to take
        time=x*0.0015;//this makes it so 500 words takes 30 minutes ; subject to change
        if(research) time=time*2;//double time if resarch needs to be done
        if(plan) time=time/2;//halves time if there is a plan
                    ////////////////////////above time is subject to changes and customization
        timef=time;
        intent.putExtra(EXTRA_MESSAGE,time);// gives the intent relevant info (text and total time ) //intent is what starts a new activty on screen
        startActivity(intent);//starts intent
    }

}
