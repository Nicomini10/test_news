package com.example.test_news.Giocatori_squadre_liga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.Giocatori_squadre_premier.fecthDataArsenal;
import com.example.test_news.R;

public class Barcelona extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataBarcelona process = new fecthDataBarcelona();
        process.execute();
    }
}
