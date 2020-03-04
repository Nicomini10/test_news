package com.example.test_news.Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_news.R;
import com.example.test_news.ScaricaCalendarioLigue1.ScaricaCalendarioLigue1Activity;

public class CalendarioLigue1 extends AppCompatActivity {

    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_ligue1);

        data = (TextView) findViewById(R.id.fectdata);
        Button button = (Button) findViewById(R.id.ScaricaCalendario);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScaricaCalendarioLigue1Activity.class);
                startActivity(intent);
            }
        });

        fecthDataCalendarioLigue1 process = new fecthDataCalendarioLigue1();
        process.execute();
    }
}
