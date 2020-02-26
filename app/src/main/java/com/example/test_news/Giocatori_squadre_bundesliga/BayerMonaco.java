package com.example.test_news.Giocatori_squadre_bundesliga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.Giocatori_squadre_premier.fecthDataArsenal;
import com.example.test_news.R;

public class BayerMonaco extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayer_monaco);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataBayerMonaco process = new fecthDataBayerMonaco();
        process.execute();
    }
}
