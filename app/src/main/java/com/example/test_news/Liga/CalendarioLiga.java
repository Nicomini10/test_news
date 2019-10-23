package com.example.test_news.Liga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class CalendarioLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataCalendarioLiga process = new fecthDataCalendarioLiga();
        process.execute();
    }
}
