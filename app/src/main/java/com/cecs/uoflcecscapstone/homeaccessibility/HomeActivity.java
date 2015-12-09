package com.cecs.uoflcecscapstone.homeaccessibility;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Drew on 10/20/2015.
 */
public class HomeActivity extends Activity implements View.OnClickListener{
    Button OpenLightsButton = null;
    Button OpenCameraButton = null;
    Button OpenDoorsButton = null;
    Button BackButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        OpenLightsButton =(Button) findViewById(R.id.openLightsButton);
        OpenLightsButton.setOnClickListener(this);
        OpenCameraButton =(Button) findViewById(R.id.openCameraButton);
        OpenCameraButton.setOnClickListener(this);
        OpenDoorsButton =(Button) findViewById(R.id.openDoorsButton);
        OpenDoorsButton.setOnClickListener(this);
        BackButton =(Button) findViewById(R.id.backButton);
        BackButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v == OpenLightsButton)
        {
            Intent myIntent=new Intent(v.getContext(),LightActivity.class);
            startActivity(myIntent);
        }
        else if (v == OpenCameraButton)
        {
            Intent myIntent=new Intent(v.getContext(),CameraActivity.class);
            startActivity(myIntent);
        }
        else if (v == OpenDoorsButton)
        {
            Intent myIntent=new Intent(v.getContext(),DoorActivity.class);
            startActivity(myIntent);
        }
        else
        {
            finish();
        }
    }
}
