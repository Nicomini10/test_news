package com.example.test_news.Giocatori_squadre_serie_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class Roma extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roma);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataRoma process = new fecthDataRoma();
        process.execute();
    }
}
