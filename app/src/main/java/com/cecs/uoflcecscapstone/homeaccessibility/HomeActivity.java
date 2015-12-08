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
    Button b1=null;
    Button b2=null;
    Button b3=null;
    Button b4=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button) findViewById(R.id.openLightsButton);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.openCameraButton);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.openDoorsButton);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.backButton);
        b4.setOnClickListener(this);
    }
    public void onClick(View v) {
if(v==b1)
{
    Intent myIntent=new Intent(v.getContext(),LightActivity.class);
    startActivity(myIntent);
}
        else if(v==b2)
{
    Intent myIntent=new Intent(v.getContext(),CameraActivity.class);
    startActivity(myIntent);
}
        else if(v==b3)
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
