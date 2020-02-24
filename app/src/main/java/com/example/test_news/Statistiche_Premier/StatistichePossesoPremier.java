package com.example.test_news.Statistiche_Premier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_SerieA.fecthDataStatisticheSerieA;

public class StatistichePossesoPremier extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_posseso_premier);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatistichePossessoPremier process = new fecthDataStatistichePossessoPremier();
        process.execute();
    }
}
