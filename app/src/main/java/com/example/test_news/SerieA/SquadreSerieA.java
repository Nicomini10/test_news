package com.example.test_news.SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.Giocatori_squadre_serie_a.Bologna;
import com.example.test_news.Giocatori_squadre_serie_a.Brescia;
import com.example.test_news.Giocatori_squadre_serie_a.Cagliari;
import com.example.test_news.Giocatori_squadre_serie_a.Fiorentina;
import com.example.test_news.Giocatori_squadre_serie_a.Genoa;
import com.example.test_news.Giocatori_squadre_serie_a.Lecce;
import com.example.test_news.Giocatori_squadre_serie_a.Parma;
import com.example.test_news.Giocatori_squadre_serie_a.Sampdoria;
import com.example.test_news.Giocatori_squadre_serie_a.Sassuolo;
import com.example.test_news.Giocatori_squadre_serie_a.Spal;
import com.example.test_news.Giocatori_squadre_serie_a.Udinese;
import com.example.test_news.Giocatori_squadre_serie_a.Verona;
import com.example.test_news.R;
import com.example.test_news.Giocatori_squadre_serie_a.Atalanta;
import com.example.test_news.Giocatori_squadre_serie_a.Inter;
import com.example.test_news.Giocatori_squadre_serie_a.Juve;
import com.example.test_news.Giocatori_squadre_serie_a.Lazio;
import com.example.test_news.Giocatori_squadre_serie_a.Milan;
import com.example.test_news.Giocatori_squadre_serie_a.Napoli;
import com.example.test_news.Giocatori_squadre_serie_a.Roma;
import com.example.test_news.Giocatori_squadre_serie_a.Torino;


public class SquadreSerieA extends AppCompatActivity {

    private ImageView juve;
    private ImageView inter;
    private ImageView milan;
    private ImageView roma;
    private ImageView napoli;
    private ImageView torino;
    private ImageView lazio;
    private ImageView atalanta;
    private ImageView bologna;
    private ImageView brescia;
    private ImageView cagliari;
    private ImageView fiorentina;
    private ImageView genoa;
    private ImageView lecce;
    private ImageView parma;
    private ImageView sampdoria;
    private ImageView sassuolo;
    private ImageView spal;
    private ImageView udinese;
    private ImageView verona;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_serie_a);

        juve = (ImageView) findViewById(R.id.imageViewJuve);
        inter = (ImageView) findViewById(R.id.imageViewInter);
        milan = (ImageView) findViewById(R.id.imageViewMilan);
        roma = (ImageView) findViewById(R.id.imageViewRoma);
        napoli = (ImageView) findViewById(R.id.imageViewNapoli);
        torino = (ImageView) findViewById(R.id.imageViewTorino);
        lazio = (ImageView) findViewById(R.id.imageViewLazio);
        atalanta = (ImageView) findViewById(R.id.imageViewAtalanta);
        bologna = (ImageView) findViewById(R.id.imageViewBologna);
        brescia = (ImageView) findViewById(R.id.imageViewBrescia);
        cagliari = (ImageView) findViewById(R.id.imageViewCagliari);
        fiorentina = (ImageView) findViewById(R.id.imageViewFiorentina);
        genoa = (ImageView) findViewById(R.id.imageViewGenoa);
        lecce = (ImageView) findViewById(R.id.imageViewLecce);
        parma = (ImageView) findViewById(R.id.imageViewParma);
        sampdoria = (ImageView) findViewById(R.id.imageViewSampdoria);
        sassuolo = (ImageView) findViewById(R.id.imageViewSassuolo);
        spal = (ImageView) findViewById(R.id.imageViewSpal);
        udinese = (ImageView) findViewById(R.id.imageViewUdinese);
        verona = (ImageView) findViewById(R.id.imageViewHellasVerona);


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

        torino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Torino.class);
                startActivity(intent);
            }
        });

        lazio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lazio.class);
                startActivity(intent);
            }
        });

        atalanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Atalanta.class);
                startActivity(intent);
            }
        });

        bologna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bologna.class);
                startActivity(intent);
            }
        });

        brescia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Brescia.class);
                startActivity(intent);
            }
        });

        cagliari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cagliari.class);
                startActivity(intent);
            }
        });

        fiorentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fiorentina.class);
                startActivity(intent);
            }
        });

        genoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Genoa.class);
                startActivity(intent);
            }
        });

        lecce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lecce.class);
                startActivity(intent);
            }
        });

        parma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Parma.class);
                startActivity(intent);
            }
        });

        sampdoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sampdoria.class);
                startActivity(intent);
            }
        });

        sassuolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sassuolo.class);
                startActivity(intent);
            }
        });

        spal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Spal.class);
                startActivity(intent);
            }
        });

        udinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Udinese.class);
                startActivity(intent);
            }
        });

        verona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Verona.class);
                startActivity(intent);
            }
        });


    }
}
