package com.example.test_news.Campionati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test_news.MainActivity;
import com.example.test_news.PremierLeague.CalendarioPremierLeague;
import com.example.test_news.PremierLeague.ClassificaPremierLeague;
import com.example.test_news.PremierLeague.MarcatoriPremierLeague;
import com.example.test_news.R;
import com.example.test_news.PremierLeague.SquadrePremierLeague;
import com.example.test_news.Statistiche_Premier.OptionStatistichePremier;
import com.example.test_news.Statistiche_SerieA.OptionStatisticheSerieaActivity;

public class PremierActivity extends AppCompatActivity {

    private ImageView squadre;
    private ImageView marcatori;
    private ImageView classifica;
    private ImageView calendario;
    private Button returnNews;
    private ImageView statistiche;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier);


        squadre = (ImageView) findViewById(R.id.imageViewSquadrePremier);
        marcatori = (ImageView) findViewById(R.id.imageViewClassificaMarcatoriPremier);
        classifica = (ImageView) findViewById(R.id.imageViewClassificaPremier);
        calendario = (ImageView) findViewById(R.id.imageViewCalendarioPremier);
        statistiche = (ImageView) findViewById(R.id.imageViewlogoStatistiche);

        returnNews = (Button) findViewById(R.id.buttonReturnNews);

        squadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SquadrePremierLeague.class);
                startActivity(intent);
            }
        });

        marcatori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarcatoriPremierLeague.class);
                startActivity(intent);
            }
        });

        classifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassificaPremierLeague.class);
                startActivity(intent);
            }
        });

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioPremierLeague.class);
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
                Intent intent = new Intent(getApplicationContext(), OptionStatistichePremier.class);
                startActivity(intent);
            }
        });

    }
}
