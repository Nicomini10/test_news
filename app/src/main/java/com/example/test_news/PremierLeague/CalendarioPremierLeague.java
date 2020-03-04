package com.example.test_news.PremierLeague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.ScaricaCalendarioPremier.ScaricaCalendarioPremierActivity;

public class CalendarioPremierLeague extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_premier_league);

        data = (TextView) findViewById(R.id.fectdata);
        Button button = (Button) findViewById(R.id.ScaricaCalendario);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScaricaCalendarioPremierActivity.class);
                startActivity(intent);
            }
        });

        fecthDataCalendarioPremier process = new fecthDataCalendarioPremier();
        process.execute();
    }
}
