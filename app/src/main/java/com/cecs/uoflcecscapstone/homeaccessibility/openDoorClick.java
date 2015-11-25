package com.cecs.uoflcecscapstone.homeaccessibility;

/**
 * Created by Drew on 11/18/2015.
 */

import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RP on 11/18/2015.
 */
public class openDoorClick extends AsyncTask<String, Void, String>
{
    static String ch;
    @Override
    protected String doInBackground(String... params)
    {
        byte[] result = null;
        String str = "";
        // Create a new HttpClient and Post Header
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://192.168.1.84:8080/open_door?door_number=1");

        try
        { // Add your data
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
            nameValuePairs.add(new BasicNameValuePair("Open","Door1"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute HTTP Post Request

            HttpResponse response = httpclient.execute(httppost);
            StatusLine statusLine = response.getStatusLine();
            if (statusLine.getStatusCode() == HttpURLConnection.HTTP_OK)
            {
                result = EntityUtils.toByteArray(response.getEntity());
                str = new String(result, "UTF-8");
                ch=str;

            }
        } catch (ClientProtocolException e)
        {
            // TODO Auto-generated catch block
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
        }
        return str;
    }

    /**
     * on getting result
     */
    @Override
    protected void onPostExecute(String result)
    {
        // something with data retrieved from server in doInBackground

    }
}

