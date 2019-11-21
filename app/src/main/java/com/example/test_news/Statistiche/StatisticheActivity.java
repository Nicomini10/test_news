package com.example.test_news.Statistiche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;
import com.example.test_news.Squadre_serie_A.Juve;

public class StatisticheActivity extends AppCompatActivity {

    private ImageView serieA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche);

       serieA = (ImageView) findViewById(R.id.imageViewSerieaStatistiche);

        serieA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticheSerieA.class);
                startActivity(intent);
            }
        });

    }
}
