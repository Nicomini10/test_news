package com.example.test_news.Statistiche_Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;

public class OptionStatisticheLigue1 extends AppCompatActivity {

    private ImageView percentualePossesopalla;
    private ImageView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_statistiche_ligue1);


        percentualePossesopalla = (ImageView) findViewById(R.id.imageViewPercentualePossesoPalla);
        quote = (ImageView) findViewById(R.id.imageViewQuote1X2);


        percentualePossesopalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatistichePossesoPallaLigue1.class);
                startActivity(intent);
            }
        });

        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticheQuoteLigue1.class);
                startActivity(intent);
            }
        });
    }
}
