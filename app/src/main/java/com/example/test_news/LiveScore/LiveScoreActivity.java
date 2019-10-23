package com.example.test_news.LiveScore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class LiveScoreActivity extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);


        data = (TextView) findViewById(R.id.fectdata);

        fecthDataLiveScore process = new fecthDataLiveScore();
        process.execute();

    }
}
