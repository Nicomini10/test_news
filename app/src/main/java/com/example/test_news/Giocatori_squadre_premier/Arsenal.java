package com.example.test_news.Giocatori_squadre_premier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class Arsenal extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataArsenal process = new fecthDataArsenal();
        process.execute();


    }
}
