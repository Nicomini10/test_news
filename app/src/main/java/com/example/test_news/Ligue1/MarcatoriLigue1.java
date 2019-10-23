package com.example.test_news.Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.SerieA.fecthDataMarcatoriSerieA;

public class MarcatoriLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatori_ligue1);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataMarcatoriLigue1 process = new fecthDataMarcatoriLigue1();
        process.execute();
    }
}
