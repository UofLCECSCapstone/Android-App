package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
        b1=(Button) findViewById(R.id.button12);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.button10);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.button13);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.button9);
        b4.setOnClickListener(this);
        b5=(Button) findViewById(R.id.button14);
        b5.setOnClickListener(this);
        b6=(Button) findViewById(R.id.button11);
        b6.setOnClickListener(this);
        b7=(Button) findViewById(R.id.button15);
        b7.setOnClickListener(this);
        b8=(Button) findViewById(R.id.button21);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.button20);
        b9.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v==b1)
        {
        }
        else if(v==b2)
        {
        }
        if(v==b3)
        {
        }
        else if(v==b4)
        {
        }
        if(v==b5)
        {
        }
        else if(v==b6)
        {
        }
        else if(v==b7)
        {
        }
        else if(v==b8)
        {
        }
        else
        {
            finish();
        }
    }
}
