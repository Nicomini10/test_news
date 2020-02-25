package com.example.test_news.Campionati_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test_news.BundesLiga.CalendarioBundesLiga;
import com.example.test_news.BundesLiga.ClassificaBundesLiga;
import com.example.test_news.BundesLiga.MarcatoriBundesLiga;
import com.example.test_news.BundesLiga.SquadreBundesliga;
import com.example.test_news.MainActivity;
import com.example.test_news.R;
import com.example.test_news.Statistiche_BundesLiga.OptionStatisticheBundesLiga;

public class BundeligaActivity extends AppCompatActivity {

    private ImageView squadre;
    private ImageView marcatori;
    private ImageView classifica;
    private ImageView calendario;
    private Button returnNews;
    private ImageView statistiche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundeliga);

        squadre = (ImageView) findViewById(R.id.imageViewSquadreBundesLiga);
        marcatori = (ImageView) findViewById(R.id.imageViewClassificaMarcatoriBundesLiga);
        classifica = (ImageView) findViewById(R.id.imageViewClassificaBundesLiga);
        calendario = (ImageView) findViewById(R.id.imageViewCalendarioBundesLiga);
        returnNews = (Button) findViewById(R.id.buttonReturnNews);
        statistiche = (ImageView) findViewById(R.id.imageViewlogoStatistiche);

        squadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SquadreBundesliga.class);
                startActivity(intent);
            }
        });

        classifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassificaBundesLiga.class);
                startActivity(intent);
            }
        });

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioBundesLiga.class);
                startActivity(intent);
            }
        });

        marcatori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarcatoriBundesLiga.class);
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
                Intent intent = new Intent(getApplicationContext(), OptionStatisticheBundesLiga.class);
                startActivity(intent);
            }
        });
    }
}
