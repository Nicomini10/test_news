package com.example.test_news.LiveScore;


import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fecthDataLiveScore extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?met=Livescore&APIkey=e4b18df2ce6d7f265da71fd7156ae4ce02d1d509ecedf0ed294fd75bfc526728");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while(line != null){

                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject jsonObject = new JSONObject(data);
            JSONArray JA = jsonObject.getJSONArray("result");
            for(int i = 0; i < JA.length(); i++){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed =  ("-  ") + JO.get("event_home_team") + (" ") + ("VS") + (" ") + JO.get("event_away_team") + "\n" +
                                ("   ") + ("Orario Inizio: ") + JO.get("event_time") + ("  ") + "\n" +
                                ("   ") + ("Minuto: ") + JO.get("event_status") + ("°") + "\n" +
                                ("   ") + ("Risultato:  ") + JO.get("event_final_result") + "\n" +
                                ("________________________________________") + "\n";

                dataParsed = dataParsed + singleParsed + "\n";

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        LiveScoreActivity.data.setText(this.dataParsed);
    }
}