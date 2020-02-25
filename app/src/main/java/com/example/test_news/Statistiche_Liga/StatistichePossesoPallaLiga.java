package com.example.test_news.Statistiche_Liga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class StatistichePossesoPallaLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche_posseso_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataStatistichePossesoPallaLiga process = new fecthDataStatistichePossesoPallaLiga();
        process.execute();
    }


}
