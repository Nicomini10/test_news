package com.example.test_news.Statistiche_SerieA;

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

public class fecthDataStatisticheMediaGoal  extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/7j0z8");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while(line != null){

                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject jsonObject = new JSONObject(data);
            JSONArray JA = jsonObject.getJSONArray("media_goal");
            for(int i = 0; i < JA.length(); i++){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed = ("- ") + JO.get("Title") + (" ") + ("(Media Goal)") + "\n" + "\n" +
                        ("  ") + JO.get("s_1") + (":  ") + JO.get("m_1") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_2") + (":  ") + JO.get("m_2") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_3") + (":  ") + JO.get("m_3") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_4") + (":  ") + JO.get("m_4") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_5") + (":  ") + JO.get("m_5") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_6") + (":  ") + JO.get("m_6") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_7") + (":  ") + JO.get("m_7") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_8") + (":  ") + JO.get("m_8") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_9") + (":  ") + JO.get("m_9") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_10") + (":  ") + JO.get("m_10") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_11") + (":  ") + JO.get("m_11") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_12") + (":  ") + JO.get("m_12") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_13") + (":  ") + JO.get("m_13") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_14") + (":  ") + JO.get("m_14") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_15") + (":  ") + JO.get("m_15") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_16") + (":  ") + JO.get("m_16") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_17") + (":  ") + JO.get("m_17") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_18") + (":  ") + JO.get("m_18") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_19") + (":  ") + JO.get("m_19") + (" ") + ("goal a partita") + "\n" + "\n" +
                        ("  ") + JO.get("s_20") + (":  ") + JO.get("m_20") + (" ") + ("goal a partita") + "\n";


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

        StatisticheMediaGoalSerieA.data.setText(this.dataParsed);
    }
}
