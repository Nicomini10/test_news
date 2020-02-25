package com.example.test_news.SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class ClassificaSerieA extends AppCompatActivity {

   public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifica__serie_a);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataClassificaSerieA process = new fecthDataClassificaSerieA();
        process.execute();
    }
}
