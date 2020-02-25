package com.example.test_news.Statistiche_Premier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_SerieA.fecthDataStatisticheQuoteSerieA;

public class StatisticheQuotePremier extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_quote_premier);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatisticheQuotePremier process = new fecthDataStatisticheQuotePremier();
        process.execute();
    }
}
