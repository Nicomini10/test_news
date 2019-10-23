package com.example.test_news.Campionati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test_news.Liga.CalendarioLiga;
import com.example.test_news.Liga.ClassificaLiga;
import com.example.test_news.Liga.MarcatoriLiga;
import com.example.test_news.Liga.SquadreLiga;
import com.example.test_news.MainActivity;
import com.example.test_news.R;

public class LigaActivity extends AppCompatActivity {


    private ImageView squadre;
    private ImageView marcatori;
    private ImageView classifica;
    private ImageView calendario;
    private Button returnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liga);

        squadre = (ImageView) findViewById(R.id.imageViewSquadreLiga);
        marcatori = (ImageView) findViewById(R.id.imageViewClassificaMarcatoriLiga);
        classifica = (ImageView) findViewById(R.id.imageViewClassificaLiga);
        calendario = (ImageView) findViewById(R.id.imageViewCalendarioLiga);
        returnNews = (Button) findViewById(R.id.buttonReturnNews);

        squadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SquadreLiga.class);
                startActivity(intent);
            }
        });

        marcatori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarcatoriLiga.class);
                startActivity(intent);
            }
        });

        classifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassificaLiga.class);
                startActivity(intent);
            }
        });

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioLiga.class);
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
    }
}
