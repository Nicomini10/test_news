package com.example.test_news.Ligue1;

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

public class fecthDataCalendarioLigue1 extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?met=Fixtures&leagueId=176&APIkey=1469a1f31030150b112a936791211da6237e21cedae1259f6ed903742242a184&from=2019-08-09&to=2020-05-23");

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
            for(int i = 377; i < JA.length(); i--){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed =  ("-  ") + JO.get("league_round") + ("°") + "\n" +
                        ("   ") + JO.get("event_home_team") + (" ") + ("Vs") + (" ") + JO.get("event_away_team") + "\n" +
                        ("   ") + JO.get("event_date") + ("  ") + JO.get("event_time") + "\n" +
                        ("   ") + ("Risultato Finale: ") + JO.get("event_final_result") + "\n";


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

        CalendarioLigue1.data.setText(this.dataParsed);
    }
}
