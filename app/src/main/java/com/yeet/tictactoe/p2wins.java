package com.yeet.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p2wins extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2);


        Button playagain2 = findViewById(R.id.playagain2);

        playagain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goback = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(goback);

            }
        });


    }
}