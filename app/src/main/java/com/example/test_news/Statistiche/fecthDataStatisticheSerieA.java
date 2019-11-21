package com.example.test_news.Statistiche;

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

public class fecthDataStatisticheSerieA  extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/9ps2u");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while(line != null){

                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject jsonObject = new JSONObject(data);
            JSONArray JA = jsonObject.getJSONArray("posseso");
            for(int i = 0; i < JA.length(); i++){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed = ("- ") + JO.get("Title") + "\n" +
                               ("  ") + JO.get("pos_palla") + "\n" + "\n" +
                               ("  ") + JO.get("s_1") + (":  ") + JO.get("pp_1") + (" %") + "\n" +
                               ("  ") + JO.get("s_2") + (":  ") + JO.get("pp_2") + (" %") + "\n" +
                               ("  ") + JO.get("s_3") + (":  ") + JO.get("pp_3") + (" %") + "\n" +
                               ("  ") + JO.get("s_4") + (":  ") + JO.get("pp_4") + (" %") + "\n" +
                               ("  ") + JO.get("s_5") + (":  ") + JO.get("pp_5") + (" %") + "\n";




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

        StatisticheSerieA.data.setText(this.dataParsed);
    }
}
