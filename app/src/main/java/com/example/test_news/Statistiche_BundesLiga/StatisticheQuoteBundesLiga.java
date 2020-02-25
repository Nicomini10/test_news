package com.example.test_news.Statistiche_BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class StatisticheQuoteBundesLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_quote_bundes_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatisticheQuoteBundesliga process = new fecthDataStatisticheQuoteBundesliga();
        process.execute();
    }
}
