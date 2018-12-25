package com.example.macintosh.flagsoftheworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String[] COUNTRIES = {

            "Australia",
            "Brazil",
            "China",
            "Egypt",
            "France",
            "Germany",
            "Ghana"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add new button to the screen
        //Button butt = new Button(this); //this refers to this activity - button needs to be placed on this activity
        GridLayout layout = (GridLayout) findViewById(R.id.main_activity); // get the layout by id
        /*butt.setText("My Button");

        //create layout parameters
        //LayoutParams is nested inside ViewGroup, that's why we need to reference it this way
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,        //width
                ViewGroup.LayoutParams.WRAP_CONTENT       //height

        );
        */

        //create layout parameters specific to LinearLayout
       /* LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,        //width
                ViewGroup.LayoutParams.WRAP_CONTENT       //height

        );
        params2.weight = 0.33f;*/

        //

        //apply the parameters to the button
        //butt.setLayoutParams(params);

        //layout.addView(butt,1); // add the button, as the second child of the layout

        for(String name : COUNTRIES) {
            addFlag(name, layout);
        }

    }

    //countryName: "Germany"
    private void addFlag(String countryName, GridLayout layout) {


        //1st param: layout to inflate, 2nd arg: where to put it
        //2nd: layout, 2nd version: parent is null: then doesn't add it
        //we might only want to add it after it has been modified
        //e.g.: in this case add it only after the text and image has been setup

        //View: super class of UI elements
        View flag = getLayoutInflater().inflate(R.layout.flag, null);

        //there is a difference between the following two:
              //findViewById(R.id.flag_text); //returns flag_text of the activity
        TextView tv = (TextView) flag.findViewById(R.id.flag_text); //returns the flag_text of the selected flag

        tv.setText(countryName);

        //convert country name, so it's suitable to access flag images
        countryName = countryName.replace(" ", "").toLowerCase();


        //get the id of the image of the current View which is inflated
        int flagImageId = getResources().getIdentifier(countryName, "drawable", getPackageName());

        //set the image
        ImageView img = (ImageView) flag.findViewById(R.id.flag_image);
        img.setImageResource(flagImageId);

        //add the setup view
        layout.addView(flag);



    }
}
