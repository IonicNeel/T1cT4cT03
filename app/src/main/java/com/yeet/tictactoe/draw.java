package com.yeet.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class draw extends AppCompatActivity {
    Button playagain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawgame);


        playagain3 = findViewById(R.id.playagain3);

        playagain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(goback);

            }
        });


    }
}