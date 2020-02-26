package com.example.test_news.Liga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.Giocatori_squadre_liga.Barcelona;
import com.example.test_news.R;

public class SquadreLiga extends AppCompatActivity {

    private ImageView barcelona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squadre_liga);


        barcelona = (ImageView) findViewById(R.id.imageViewBarcelona);


        barcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Barcelona.class);
                startActivity(intent);
            }
        });
    }

}
