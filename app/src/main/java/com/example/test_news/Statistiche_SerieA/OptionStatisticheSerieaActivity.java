package com.example.test_news.Statistiche_SerieA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;

public class OptionStatisticheSerieaActivity extends AppCompatActivity {

    private ImageView percentualePossesopalla;
    private ImageView mediaGoal;
    private ImageView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_statistiche_serie);

        percentualePossesopalla = (ImageView) findViewById(R.id.imageViewPercentualePossesoPalla);
        mediaGoal = (ImageView) findViewById(R.id.imageViewMediaGoal);
        quote = (ImageView) findViewById(R.id.imageViewQuote1X2);


        percentualePossesopalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatistichePossesoPallaSerieA.class);
                startActivity(intent);
            }
        });

        mediaGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticheMediaGoalSerieA.class);
                startActivity(intent);
            }
        });

        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticheQuoteSerieA.class);
                startActivity(intent);
            }
        });

    }
}
