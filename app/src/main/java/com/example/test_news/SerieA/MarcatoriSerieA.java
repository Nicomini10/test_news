package com.example.test_news.SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class MarcatoriSerieA extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatori);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataMarcatoriSerieA process = new fecthDataMarcatoriSerieA();
        process.execute();
    }
}