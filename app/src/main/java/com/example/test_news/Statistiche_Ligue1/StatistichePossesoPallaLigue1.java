package com.example.test_news.Statistiche_Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_SerieA.fecthDataStatistichePossesoPallaSerieA;

public class StatistichePossesoPallaLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_posseso_ligue1);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatistichePossesoPallaLigue1 process = new fecthDataStatistichePossesoPallaLigue1();
        process.execute();
    }
}
