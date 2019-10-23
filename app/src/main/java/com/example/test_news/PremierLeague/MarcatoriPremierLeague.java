package com.example.test_news.PremierLeague;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class MarcatoriPremierLeague extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatori_premier_league);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataMarcatoriPremier process = new fecthDataMarcatoriPremier();
        process.execute();
    }
}
