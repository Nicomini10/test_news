package com.example.test_news.Statistiche_Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_SerieA.fecthDataStatisticheQuoteSerieA;

public class StatisticheQuoteLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_quote_ligue1);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatisticheQuoteLigue1 process = new fecthDataStatisticheQuoteLigue1();
        process.execute();
    }
}
