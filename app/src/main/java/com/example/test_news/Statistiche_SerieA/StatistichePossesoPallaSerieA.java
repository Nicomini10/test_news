package com.example.test_news.Statistiche_SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class StatistichePossesoPallaSerieA extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_serie);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatistichePossesoPallaSerieA process = new fecthDataStatistichePossesoPallaSerieA();
        process.execute();
    }
}
