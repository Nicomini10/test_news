package com.example.test_news.SerieA;


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

public class fecthDataMarcatoriSerieA extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?&met=Topscorers&leagueId=262&APIkey=34b4c6e52acb9a70ab30f1802ae4bd7fd48fe27e1b0c717dddab02dcc0d8a447");

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

                singleParsed = ("- ") + JO.get("player_name")  + ("     ") + ("GOAL: ") + JO.get("goals") + "\n" +
                               (" ") + ("(") + JO.get("team_name") + (")") + "\n" + "\n";

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

        MarcatoriSerieA.data.setText(this.dataParsed);
    }
}
