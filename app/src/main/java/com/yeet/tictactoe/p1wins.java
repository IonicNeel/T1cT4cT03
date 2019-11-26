package com.yeet.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p1wins extends AppCompatActivity {
    Button playagain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p1);


        playagain1 = findViewById(R.id.playagain1);

        playagain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(goback);

            }
        });


    }
}