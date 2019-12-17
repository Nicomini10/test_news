package com.example.test_news.Statistiche_SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_BundesLiga.OptionStatisticheBundesLiga;
import com.example.test_news.Statistiche_Liga.OptionStatisticheLiga;
import com.example.test_news.Statistiche_Ligue1.OptionStatisticheLigue1;
import com.example.test_news.Statistiche_Premier.OptionStatistichePremier;

public class StatisticheActivity extends AppCompatActivity {

    private ImageView serieA;
    private ImageView premier;
    private ImageView liga;
    private ImageView bundesliga;
    private ImageView ligue1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiche);

       serieA = (ImageView) findViewById(R.id.imageViewSerieaStatistiche);
       premier = (ImageView) findViewById(R.id.imageViewPremierStatistiche);
       liga = (ImageView) findViewById(R.id.imageViewLigaStatistiche);
       bundesliga = (ImageView) findViewById(R.id.imageViewBundesLigaStatistiche);
       ligue1 = (ImageView) findViewById(R.id.imageViewLigue1Statistiche);

        serieA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheSerieaActivity.class);
                startActivity(intent);
            }
        });

        premier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatistichePremier.class);
                startActivity(intent);
            }
        });

        liga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheLiga.class);
                startActivity(intent);
            }
        });

        bundesliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheBundesLiga.class);
                startActivity(intent);
            }
        });

        ligue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheLigue1.class);
                startActivity(intent);
            }
        });

    }
}
