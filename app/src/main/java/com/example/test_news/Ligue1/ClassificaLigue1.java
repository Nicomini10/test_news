package com.example.test_news.Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class ClassificaLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifica_ligue1);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataClassificaLigue1 process = new fecthDataClassificaLigue1();
        process.execute();
    }
}
