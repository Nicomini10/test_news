package com.example.test_news.Campionati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test_news.Ligue1.CalendarioLigue1;
import com.example.test_news.Ligue1.ClassificaLigue1;
import com.example.test_news.Ligue1.MarcatoriLigue1;
import com.example.test_news.Ligue1.SquadreLigue1;
import com.example.test_news.MainActivity;
import com.example.test_news.R;

public class Ligue1Activity extends AppCompatActivity {

    private ImageView squadre;
    private ImageView marcatori;
    private ImageView classifica;
    private ImageView calendario;
    private Button returnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligue1);


        squadre = (ImageView) findViewById(R.id.imageViewSquadreLigue1);
        marcatori = (ImageView) findViewById(R.id.imageViewClassificaMarcatoriLigue1);
        classifica = (ImageView) findViewById(R.id.imageViewClassificaLigue1);
        calendario = (ImageView) findViewById(R.id.imageViewCalendarioLigue1);
        returnNews = (Button) findViewById(R.id.buttonReturnNews);


        squadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SquadreLigue1.class);
                startActivity(intent);
            }
        });

        marcatori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarcatoriLigue1.class);
                startActivity(intent);
            }
        });

        classifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClassificaLigue1.class);
                startActivity(intent);
            }
        });

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioLigue1.class);
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
