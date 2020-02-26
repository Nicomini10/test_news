package com.example.test_news.Giocatori_squadre_ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.Giocatori_squadre_premier.fecthDataArsenal;
import com.example.test_news.R;

public class ParisSG extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris_sg);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataParisSG process = new fecthDataParisSG();
        process.execute();
    }
}
