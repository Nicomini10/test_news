package com.example.test_news.Statistiche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;

public class OptionStatisticheSerieaActivity extends AppCompatActivity {

    private ImageView percentualePossesopalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_statistiche_serie);

        percentualePossesopalla = (ImageView) findViewById(R.id.imageViewPercentualePossesoPalla);

        percentualePossesopalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatistichePossesoPallaSerieA.class);
                startActivity(intent);
            }
        });
    }
}
