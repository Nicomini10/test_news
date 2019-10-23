package com.example.test_news.BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test_news.R;

public class MarcatoriBundesLiga extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcatori_bundes_liga);

        data = (TextView) findViewById(R.id.fectdata);

        fecthDataMarcatoriBundesLiga process = new fecthDataMarcatoriBundesLiga();
        process.execute();
    }
}
