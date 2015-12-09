package com.cecs.uoflcecscapstone.homeaccessibility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startButton = null;
    Button quitButton = null;
    Button settingsButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton =(Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        quitButton =(Button) findViewById(R.id.quitButton);
        quitButton.setOnClickListener(this);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        if(v == startButton)
        {
            Intent homeIntent = new Intent(v.getContext(), HomeActivity.class);
            startActivity(homeIntent);
        }
        else if (v == settingsButton)
        {
            Intent settingsIntent = new Intent(v.getContext(), SettingsActivity.class);
            startActivity(settingsIntent);
        }
        else if (v == quitButton)
        {
            finish();
        }
    }
}
