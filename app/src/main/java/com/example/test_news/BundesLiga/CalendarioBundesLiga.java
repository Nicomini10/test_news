package com.example.test_news.BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.SerieA.fecthDataCalendarioSerieA;

public class CalendarioBundesLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_bundes_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataCalendarioBundesLiga process = new fecthDataCalendarioBundesLiga();
        process.execute();
    }
}
