package com.example.test_news.Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.SerieA.fecthDataCalendarioSerieA;

public class CalendarioLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_ligue1);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataCalendarioLigue1 process = new fecthDataCalendarioLigue1();
        process.execute();
    }
}
