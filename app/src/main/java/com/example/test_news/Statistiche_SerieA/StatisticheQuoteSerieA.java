package com.example.test_news.Statistiche_SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class StatisticheQuoteSerieA extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_quote_serie);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatisticheQuoteSerieA process = new fecthDataStatisticheQuoteSerieA();
        process.execute();
    }
}
