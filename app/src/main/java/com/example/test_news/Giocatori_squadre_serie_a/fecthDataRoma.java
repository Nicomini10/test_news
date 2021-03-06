package com.example.test_news.Giocatori_squadre_serie_a;

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

public class fecthDataRoma extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://allsportsapi.com/api/football/?&met=Teams&teamId=4184&APIkey=d50e947c89b5f6faf60f34de2638da1d7fa9b92762c9c767ba5d464757a3d879");

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

                            singleParsed = ("- ") + JO2.get("player_name") + "\n" +
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

        Roma.data.setText(this.dataParsed);
    }
}
