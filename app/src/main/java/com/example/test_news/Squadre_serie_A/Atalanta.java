package com.example.test_news.Squadre_serie_A;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class Atalanta extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atalanta);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataAtalanta process = new fecthDataAtalanta();
        process.execute();
    }
}
