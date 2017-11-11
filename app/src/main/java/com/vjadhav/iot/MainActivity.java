package com.vjadhav.iot;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView celcius = (TextView) findViewById(R.id.celcius);
        TextView temp = (TextView) findViewById(R.id.temp);
        TextView people = (TextView) findViewById(R.id.people);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/segment7.ttf");
        temp.setTypeface(font1);
        celcius.setTypeface(font1);
        people.setTypeface(font1);
    }

    public void setRoomlights(View v) {
        startActivity(new Intent(MainActivity.this, RoomLights.class));
    }

    public void setACcontrol(View v) {
        startActivity(new Intent(MainActivity.this, AC_control.class));
    }
}
