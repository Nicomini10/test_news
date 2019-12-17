package com.example.test_news.Statistiche_BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;
import com.example.test_news.Statistiche_Liga.StatistichePossesoLiga;
import com.example.test_news.Statistiche_Liga.StatisticheQuoteLiga;

public class OptionStatisticheBundesLiga extends AppCompatActivity {

    private ImageView percentualePossesopalla;
    private ImageView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_statistiche_bundes_liga);

        percentualePossesopalla = (ImageView) findViewById(R.id.imageViewPercentualePossesoPalla);
        quote = (ImageView) findViewById(R.id.imageViewQuote1X2);


        percentualePossesopalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatistichePossesoBundesLiga.class);
                startActivity(intent);
            }
        });

        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticheQuoteBundesLiga.class);
                startActivity(intent);
            }
        });


    }
}
