package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Drew on 10/20/2015.
 */
public class DoorActivity extends Activity implements View.OnClickListener{
    Button b1=null;
    Button b2=null;
    Button b3=null;
    Button b4=null;
    Button b5=null;
    Button b6=null;
    Button b7=null;
    Button b8=null;
    Button b9=null;
    static URI website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
        b1=(Button) findViewById(R.id.button12);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.button10);
        b2.setOnClickListener(this);
        b4=(Button) findViewById(R.id.button9);
        b4.setOnClickListener(this);
        b6=(Button) findViewById(R.id.button11);
        b6.setOnClickListener(this);
        b8=(Button) findViewById(R.id.button21);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.button20);
        b9.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button10:
            {
                //door 1 open
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=1");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
break;
            }

            case R.id.button9:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=2");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.button11:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=3");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }                break;
            }





            case R.id.button21:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=4");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.button12:
            {
                // get door status
                try {
                    website= new URI("https://192.168.1.84:8080/get_door_status");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }

                break;
            }

            case R.id.button20:
            {
                // back
finish();            }


        }
        Intent myIntent = new Intent(v.getContext(), StatusActivity.class);
        startActivity(myIntent);

    }
}
