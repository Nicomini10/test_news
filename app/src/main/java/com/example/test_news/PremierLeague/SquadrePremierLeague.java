package com.example.test_news.PremierLeague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.Giocatori_squadre_premier.Arsenal;
import com.example.test_news.R;

public class SquadrePremierLeague extends AppCompatActivity {

    private ImageView arsenal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_premier_league);

        arsenal = (ImageView) findViewById(R.id.imageViewArsenal);


        arsenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Arsenal.class);
                startActivity(intent);
            }
        });
    }
}
