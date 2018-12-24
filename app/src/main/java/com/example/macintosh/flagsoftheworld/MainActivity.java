package com.example.macintosh.flagsoftheworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add new button to the screen
        Button butt = new Button(this); //this refers to this activity - button needs to be placed on this activity
        LinearLayout layout = (LinearLayout) findViewById(R.id.main_activity); // get the layout by id
        butt.setText("My Button");

        //create layout parameters
        //LayoutParams is nested inside ViewGroup, that's why we need to reference it this way
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,        //width
                ViewGroup.LayoutParams.WRAP_CONTENT       //height

        );

        //create layout parameters specific to LinearLayout
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,        //width
                ViewGroup.LayoutParams.WRAP_CONTENT       //height

        );
        params2.weight = 0.33f;

        //

        //apply the parameters to the button
        butt.setLayoutParams(params);

        layout.addView(butt,1); // add the button, as the second child of the layout



        //Using a layout inflater (inside an activity) to create 3 flags
        getLayoutInflater().inflate(R.layout.flag, layout);

        //1st param: layout to inflate, 2nd arg: where to put it

        getLayoutInflater().inflate(R.layout.flag, layout);

        getLayoutInflater().inflate(R.layout.flag, layout);


    }
}
