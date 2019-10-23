package com.example.test_news.Liga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class MarcatoriLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatori_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataMarcatoriLiga process = new fecthDataMarcatoriLiga();
        process.execute();
    }
}
