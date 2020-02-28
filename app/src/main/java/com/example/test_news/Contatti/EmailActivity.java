package com.example.test_news.Contatti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.test_news.R;

public class EmailActivity extends AppCompatActivity {

    private EditText oggettoEmail;
    private EditText testoEmail;
    private Button buttonInviaEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        oggettoEmail = (EditText) findViewById(R.id.editTextOggettoEmail);
        testoEmail = (EditText) findViewById(R.id.editTestoEmail);
        buttonInviaEmail = (Button) findViewById(R.id.buttonInviaEmail);

        buttonInviaEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.putExtra(Intent.EXTRA_SUBJECT, oggettoEmail.getText().toString());

                emailIntent.putExtra(emailIntent.EXTRA_EMAIL, new String[]{"infofootball@gmail.com"});

                emailIntent.putExtra(emailIntent.EXTRA_TEXT, testoEmail.getText());
                emailIntent.setType("message/rfc822");
                startActivity(emailIntent);


            }
        });

    }
}
