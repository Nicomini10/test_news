package com.example.test_news.Statistiche_BundesLiga;

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

public class fecthDataStatistichePossesoPallaBundesliga extends AsyncTask<Void,Void,Void> {

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

                singleParsed = ("- ") + JO.get("lega") + "\n" +
                        ("  ") + JO.get("pos_palla") + "\n" + "\n" +
                        ("  ") + JO.get("s_1") + (":  ") + JO.get("pp_1") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_2") + (":  ") + JO.get("pp_2") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_3") + (":  ") + JO.get("pp_3") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_4") + (":  ") + JO.get("pp_4") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_5") + (":  ") + JO.get("pp_5") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_6") + (":  ") + JO.get("pp_6") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_7") + (":  ") + JO.get("pp_7") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_8") + (":  ") + JO.get("pp_8") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_9") + (":  ") + JO.get("pp_9") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_10") + (":  ") + JO.get("pp_10") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_11") + (":  ") + JO.get("pp_11") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_12") + (":  ") + JO.get("pp_12") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_13") + (":  ") + JO.get("pp_13") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_14") + (":  ") + JO.get("pp_14") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_15") + (":  ") + JO.get("pp_15") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_16") + (":  ") + JO.get("pp_16") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_17") + (":  ") + JO.get("pp_17") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_18") + (":  ") + JO.get("pp_18") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_19") + (":  ") + JO.get("pp_19") + (" %") + "\n" + "\n" +
                        ("  ") + JO.get("s_20") + (":  ") + JO.get("pp_20") + (" %") + "\n";


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

        StatistichePossesoBundesLiga.data.setText(this.dataParsed);
    }
}
