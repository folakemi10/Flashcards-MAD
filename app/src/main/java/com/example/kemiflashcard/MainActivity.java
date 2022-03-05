package com.example.kemiflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      TextView questionText = findViewById(R.id.flashcard_q_textview);
      TextView answerText = findViewById(R.id.flashcard_a_textview);
       questionText.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               questionText.setVisibility(View.INVISIBLE);
               answerText.setVisibility(View.VISIBLE);
           }});

        answerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answerText.setVisibility(View.INVISIBLE);
                questionText.setVisibility(View.VISIBLE);
            }});


     }
    }
