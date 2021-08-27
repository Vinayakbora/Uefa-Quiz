package com.example.uefaquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] questions={"Barcelona won in 2015","Messi was top scorer in 2018?","Havertz scored the winner in 2021?"};
    private Boolean[] answers={true,false,true};
    private int score=0;
    Button one;
    Button two;
    TextView textView;

    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.button);
        two=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        textView.setText(questions[index]);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length - 1) {
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        textView.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the App to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length - 1) {
                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        textView.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the App to play again", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}