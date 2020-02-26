package com.example.test_news.Ligue1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.Giocatori_squadre_ligue1.ParisSG;
import com.example.test_news.R;

public class SquadreLigue1 extends AppCompatActivity {

    private ImageView parisSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_ligue1);

        parisSG = (ImageView) findViewById(R.id.imageViewParis);


        parisSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ParisSG.class);
                startActivity(intent);
            }
        });

    }
}
