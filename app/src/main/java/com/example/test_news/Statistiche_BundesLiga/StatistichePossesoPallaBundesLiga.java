package com.example.test_news.Statistiche_BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class StatistichePossesoPallaBundesLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_posseso_bundesliga);

        data = (TextView) findViewById(R.id.fectdata);


        fecthDataStatistichePossesoPallaBundesliga process = new fecthDataStatistichePossesoPallaBundesliga();
        process.execute();
    }
}
