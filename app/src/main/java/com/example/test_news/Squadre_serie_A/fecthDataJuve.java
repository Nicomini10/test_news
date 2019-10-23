package com.example.test_news.Squadre_serie_A;


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

public class fecthDataJuve extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?&met=Teams&teamId=4187&APIkey=b2b5837ea483cdec29a823e1263690d3289391be859a2400122c30fb75186730");

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
            if(JA != null) {
                for (int i = 0; i < JA.length(); i++) {
                    JSONObject JO = JA.getJSONObject(i);

                    if (JO != null) {
                        JSONArray JA2 = JO.getJSONArray("players");
                        for (int j = 0; j < JA2.length(); j++) {
                            JSONObject JO2 = JA2.getJSONObject(j);

                            singleParsed = ("-  ") + JO2.get("player_name") + "\n" +
                                           ("   ") + ("Ruolo:  ") + JO2.get("player_type") + "\n" +
                                           ("   ") + ("Età:  ") + JO2.get("player_age") + "\n" +
                                           ("   ") + ("Numero di maglia:  ") + JO2.get("player_number") + "\n";


                            dataParsed = dataParsed + singleParsed + "\n";

                        }

                        JSONArray JA3 = JO.getJSONArray("coaches");
                        for(int k = 0; k < JA3.length(); k++){

                            JSONObject JO3 = JA3.getJSONObject(k);

                            singleParsed = ("-  ") + "Allenatore:  " + JO3.get("coach_name") + "\n" +
                                           ("   ") + "Età:  " + JO3.get("coach_age") + "\n";

                            dataParsed = dataParsed + singleParsed + "\n";


                        }

                    }
                }

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

        Juve.data.setText(this.dataParsed);
    }

}