package com.example.test_news.Video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.LiveScore.fecthDataLiveScore;
import com.example.test_news.R;

public class VideoActivity extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataVideo process = new fecthDataVideo();
        process.execute();
    }
}
