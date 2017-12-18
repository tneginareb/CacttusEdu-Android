package com.gentb.cacttusedu.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.gentb.cacttusedu.R;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by gentberani on 12/18/17.
 */

public class ServiceActivity extends Activity {


    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);


        new AsyncTask<String, Integer, String>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected String doInBackground(String... strings) {


                final String url = "http://10.45.0.34:8888/cacttusedu/index.php?Lendet&UserID=1";
                final OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url(url)
                        .build();

                Response response = null;

                try {
                    response = client.newCall(request).execute();
                    final String stringResponse = response.body().string();
                    return stringResponse;
                } catch (IOException e) {
                    e.printStackTrace();

                }

                return null;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
            }

            @Override
            protected void onPostExecute(String response) {
                super.onPostExecute(response);
                System.out.println("response: " + response);

            }
        }.execute();
    }
}
