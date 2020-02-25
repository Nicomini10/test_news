package com.example.test_news.Statistiche_Liga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_SerieA.fecthDataStatisticheQuoteSerieA;

public class StatisticheQuoteLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_quote_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatisticheQuoteLiga process = new fecthDataStatisticheQuoteLiga();
        process.execute();
    }
}
