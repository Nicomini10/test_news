package com.example.test_news.Campionati_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test_news.SerieA.CalendarioSerieA;
import com.example.test_news.SerieA.ClassificaSerieA;
import com.example.test_news.MainActivity;
import com.example.test_news.SerieA.MarcatoriSerieA;
import com.example.test_news.R;
import com.example.test_news.SerieA.SquadreSerieA;
import com.example.test_news.Statistiche_SerieA.OptionStatisticheSerieaActivity;

public class SerieaActivity extends AppCompatActivity {


    private ImageView squadre;
    private ImageView marcatori;
    private ImageView classifica;
    private ImageView calendario;
    private Button returnNews;
    private ImageView statistiche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seriea);

        squadre = (ImageView) findViewById(R.id.imageViewSquadre);
        marcatori = (ImageView) findViewById(R.id.imageViewClassificaMarcatori);
        classifica = (ImageView) findViewById(R.id.imageViewClassifica);
        calendario = (ImageView) findViewById(R.id.imageViewCalendario);
        returnNews = (Button) findViewById(R.id.buttonReturnNews);
        statistiche = (ImageView) findViewById(R.id.imageViewlogoStatistiche);


        squadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SquadreSerieA.class);
                startActivity(intent);
            }
        });

        classifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassificaSerieA.class);
                startActivity(intent);
            }
        });

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioSerieA.class);
                startActivity(intent);
            }
        });


        marcatori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarcatoriSerieA.class);
                startActivity(intent);
            }
        });


        returnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        statistiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheSerieaActivity.class);
                startActivity(intent);
            }
        });

    }


}
