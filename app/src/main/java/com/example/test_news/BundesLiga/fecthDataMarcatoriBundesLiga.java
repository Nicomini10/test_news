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

public class fecthDataMarcatoriBundesLiga extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?&met=Topscorers&leagueId=195&APIkey=5f556ecaf63537f75bf161b25f79ab968fc7a371d6b10c0ef9c67b53725c9106");

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

                singleParsed = ("-  ") + JO.get("player_name")  + ("     ") + ("GOAL: ") + JO.get("goals") + "\n" +
                               ("   ") + ("(") + JO.get("team_name") + (")") + "\n";

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

        MarcatoriBundesLiga.data.setText(this.dataParsed);
    }
}
