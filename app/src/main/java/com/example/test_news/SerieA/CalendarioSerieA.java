package com.example.test_news.SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class CalendarioSerieA extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_serie_a);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataCalendarioSerieA process = new fecthDataCalendarioSerieA();
        process.execute();

    }
}
