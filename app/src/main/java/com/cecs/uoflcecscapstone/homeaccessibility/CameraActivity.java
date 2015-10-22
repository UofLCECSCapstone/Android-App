package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Drew on 10/20/2015.
 */
public class CameraActivity extends Activity implements View.OnClickListener{
    Button b1=null;
    Button b2=null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        b1=(Button) findViewById(R.id.button8);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.button19);
        b2.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v==b1)
        {
        }
        else
        {
            finish();
        }
    }
}
