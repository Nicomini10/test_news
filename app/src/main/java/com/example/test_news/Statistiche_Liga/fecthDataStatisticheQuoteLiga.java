package com.example.test_news.Statistiche_Liga;

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

public class fecthDataStatisticheQuoteLiga extends AsyncTask<Void,Void,Void> {


    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids)

    {

        try {
            URL url = new URL("https://api.myjson.com/bins/op8uw");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while(line != null){

                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject jsonObject = new JSONObject(data);
            JSONArray JA = jsonObject.getJSONArray("quote");
            for(int i = 0; i < JA.length(); i++){
                JSONObject JO = JA.getJSONObject(i);

                singleParsed = ("- ") + JO.get("lega") + "\n" + "\n" +
                        ("  ") + ("Numero Partite: ") + JO.get("num_partite") + "\n" + "\n" +
                        ("  ") + ("Esito 1:  ") + JO.get("esito_1") + (" ") + ("%") + "\n" + "\n" +
                        ("  ") + ("Esito X:  ") +JO.get("esito_X") + (" ") + ("%") + "\n"  + "\n" +
                        ("  ") + ("Esito 2:  ") +JO.get("esito_2") + (" ") + ("%") +  "\n";

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

        StatisticheQuoteLiga.data.setText(this.dataParsed);
    }
}
