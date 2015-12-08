package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Drew on 10/20/2015.
 */
public class LightActivity extends Activity implements View.OnClickListener{
    Button GetLightStatusButton = null;
    Button LightOnButton = null;
    Button LightOffButton = null;
    Button BackButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        GetLightStatusButton = (Button) findViewById(R.id.getLightStatusButton);
        GetLightStatusButton.setOnClickListener(this);
        LightOnButton = (Button) findViewById(R.id.lightOnButton);
        LightOnButton.setOnClickListener(this);
        LightOffButton = (Button) findViewById(R.id.lightOffButton);
        LightOffButton.setOnClickListener(this);
        BackButton = (Button) findViewById(R.id.backButton);
        BackButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == GetLightStatusButton)
        {
        }
        else if(v == LightOnButton)
        {
        }
        else if(v == LightOffButton)
        {
        }
        else
        {
            finish();
        }
    }
}
