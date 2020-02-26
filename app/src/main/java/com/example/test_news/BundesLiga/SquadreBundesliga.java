package com.example.test_news.BundesLiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.Giocatori_squadre_bundesliga.BayerMonaco;
import com.example.test_news.R;

public class SquadreBundesliga extends AppCompatActivity {

    private ImageView bayerMonaco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_bundesliga);

        bayerMonaco = (ImageView) findViewById(R.id.imageViewBayer);


        bayerMonaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BayerMonaco.class);
                startActivity(intent);
            }
        });
    }
}
