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
    Button b1=null;
    Button b2=null;
    Button b3=null;
    Button b4=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        b1=(Button) findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.button6);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.button7);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.button18);
        b4.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v==b1)
        {
        }
        else if(v==b2)
        {
        }
        else if(v==b3)
        {
        }
        else
        {
            finish();
        }
    }
}
