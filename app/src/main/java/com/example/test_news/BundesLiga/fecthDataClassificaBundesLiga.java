package com.example.test_news.BundesLiga;

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

public class fecthDataClassificaBundesLiga extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?&met=Standings&leagueId=195&APIkey=e4b18df2ce6d7f265da71fd7156ae4ce02d1d509ecedf0ed294fd75bfc526728");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while(line != null){

                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject jsonObject = new JSONObject(data).getJSONObject("result");
            JSONArray JA = jsonObject.getJSONArray("total");
            for(int i = 0; i < JA.length(); i++){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed = JO.get("standing_place") + (")") + ("  ") + JO.get("standing_team") + (":  ") + JO.get("standing_PTS") + (" ") + ("pts") + "\n";

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

        ClassificaBundesLiga.data.setText(this.dataParsed);
    }
}
