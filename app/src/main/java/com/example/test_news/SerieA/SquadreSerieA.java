package com.example.test_news.SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;
import com.example.test_news.Squadre_serie_A.Inter;
import com.example.test_news.Squadre_serie_A.Juve;
import com.example.test_news.Squadre_serie_A.Milan;
import com.example.test_news.Squadre_serie_A.Napoli;
import com.example.test_news.Squadre_serie_A.Roma;


public class SquadreSerieA extends AppCompatActivity {

    private ImageView juve;
    private ImageView inter;
    private ImageView milan;
    private ImageView roma;
    private ImageView napoli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_serie_a);

        juve = (ImageView) findViewById(R.id.imageViewJuve);
        inter = (ImageView) findViewById(R.id.imageViewInter);
        milan = (ImageView) findViewById(R.id.imageViewMilan);
        roma = (ImageView) findViewById(R.id.imageViewRoma);
        napoli = (ImageView) findViewById(R.id.imageViewNapoli);

        juve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Juve.class);
                startActivity(intent);
            }
        });

        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Inter.class);
                startActivity(intent);
            }
        });

        milan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Milan.class);
                startActivity(intent);
            }
        });

        roma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Roma.class);
                startActivity(intent);
            }
        });

        napoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Napoli.class);
                startActivity(intent);
            }
        });

    }
}
