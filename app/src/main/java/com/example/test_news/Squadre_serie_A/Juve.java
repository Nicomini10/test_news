package com.example.test_news.Squadre_serie_A;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;


public class Juve extends AppCompatActivity {

    public static TextView data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juve);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataJuve process = new fecthDataJuve();
        process.execute();

    }


}
