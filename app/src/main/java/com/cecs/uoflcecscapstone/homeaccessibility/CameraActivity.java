package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Drew on 10/20/2015.
 */
public class CameraActivity extends Activity implements View.OnClickListener{
    Button LookAtCameraButton = null;
    Button BackButton = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        LookAtCameraButton = (Button) findViewById(R.id.lookAtCameraButton);
        LookAtCameraButton.setOnClickListener(this);
        BackButton = (Button) findViewById(R.id.backButton);
        BackButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == LookAtCameraButton)
        {
        }
        else
        {
            finish();
        }
    }
}
