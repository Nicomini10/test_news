package com.example.test_news.Contatti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.test_news.R;

public class ContattiActivity extends AppCompatActivity {

    private ImageView facebook;
    private ImageView instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatti);

        facebook = (ImageView) findViewById(R.id.imageFacebook);
        instagram = (ImageView) findViewById(R.id.imageInstagram);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://it-it.facebook.com/nico.minichillo.5");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.instagram.com/nicomini10_/?hl=it");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });




    }
}
