package com.gentb.cacttusedu.network;

import android.os.AsyncTask;

import com.gentb.cacttusedu.models.Lenda;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by gentberani on 12/21/17.
 */

public class LendetTask extends AsyncTask<String, Integer, String> {

    private LendetCallback callback;

    public LendetTask(LendetCallback callback) {
        this.callback = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {

        final String url = Endpoints.lendetEndpoint;
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

        if (response != null) {
            onSuccessResponse(response);
        } else {
            callback.onLendetResponse(null, false);
            System.out.println("Ka ndodhur nje gabim!");
        }
    }

    private void onSuccessResponse(String response) {
        ArrayList<Lenda> arrayList = new ArrayList<>();
        try {
            final JSONArray jsonArray = new JSONArray(response);
            for (int i = 0; i < jsonArray.length(); i++) {

                final JSONObject jsonObject = jsonArray.optJSONObject(i);
                final Lenda lenda = new Lenda(jsonObject);
                arrayList.add(lenda);
                System.out.println("Titulli: " + lenda.getTitulli());
            }
            callback.onLendetResponse(arrayList, true);
        } catch (JSONException e) {
            e.printStackTrace();
            callback.onLendetResponse(null, false);
        }
    }
}