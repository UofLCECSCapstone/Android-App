package com.cecs.uoflcecscapstone.homeaccessibility;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Drew on 11/26/2015.
 */
public class StatusActivity extends Activity implements View.OnClickListener{

    TextView httpStuff;
    Button b1=null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        httpStuff = (TextView) findViewById(R.id.textView2);
        b1 = (Button) findViewById(R.id.button13);
        b1.setOnClickListener(this);
        new LongOperation().execute("");

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {finish();
        }
    }

    private class LongOperation extends AsyncTask<String, Void, String> {
        @Override

        protected String doInBackground(String... params) {

            ButtonClick test = new ButtonClick();
            String returned = null;

            try {
                returned = test.getRequest();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return returned;
        }

        @Override
        protected void onPostExecute(String result) {
            httpStuff.setText(result);
        }
    }
}