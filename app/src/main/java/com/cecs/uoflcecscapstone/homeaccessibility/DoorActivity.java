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
    Button ToggleDoor1Button = null;
    Button ToggleDoor2Button = null;
    Button ToggleDoor3Button = null;
    Button ToggleGarageDoorButton = null;
    Button GetDoorStatusButton = null;
    static URI website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
        GetDoorStatusButton = (Button) findViewById(R.id.getDoorStatusButton);
        GetDoorStatusButton.setOnClickListener(this);
        ToggleDoor1Button =(Button) findViewById(R.id.toggleDoor1Button);
        ToggleDoor1Button.setOnClickListener(this);
        ToggleDoor2Button = (Button) findViewById(R.id.toggleDoor2Button);
        ToggleDoor2Button.setOnClickListener(this);
        ToggleDoor3Button = (Button) findViewById(R.id.toggleDoor3Button);
        ToggleDoor3Button.setOnClickListener(this);
        ToggleGarageDoorButton = (Button) findViewById(R.id.toggleGarageDoorButton);
        ToggleGarageDoorButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.toggleDoor1Button:
            {
                //  TODO Refactor this code to re-use the query, and just change the door number.
                //door 1 open
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=1");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.toggleDoor2Button:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=2");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.toggleDoor3Button:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=3");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.toggleGarageDoorButton:
            {
                try {
                    website= new URI("https://192.168.1.84:8080/toggle_door?door_number=4");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                break;
            }

            case R.id.getDoorStatusButton:
            {
                // get door status
                try {
                    website= new URI("https://192.168.1.84:8080/get_door_status");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }

                break;
            }

            case R.id.backButton:
            {
                // back
                finish();
            }


        }
        Intent myIntent = new Intent(v.getContext(), StatusActivity.class);
        startActivity(myIntent);
    }
}