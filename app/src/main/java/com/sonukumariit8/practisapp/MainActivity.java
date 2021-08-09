package com.sonukumariit8.practisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"Java is a person","Java was introduced in 1233?"
    ,"Java was created using Pyhton?","Java has abstract classes?","Java supports interfaces?","Is java very very easy language?"};
    private  boolean[] answers={false,false,false,true,true,false};
    private int score=0;
    Button yes;
    Button no;
    TextView question;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (index<=questions.length - 1){
                //if you have given correct ans
                if (answers[index]==true){
                    score++;
                }
                // Go to the next question
                index++;
                if (index<=questions.length - 1){
                    question.setText(questions[index]);
                }
                else {
                    Toast.makeText(MainActivity.this, "Your score is" + score +"/"+ questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(MainActivity.this, "Restart the App to play Again", Toast.LENGTH_SHORT).show();
            }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if array is not going out of bound
                if (index<=questions.length - 1){
                    //if you have given correct ans
                    if (answers[index]==false){
                        score++;
                    }
                    // Go to the next question
                    index++;
                    if (index<=questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is" + score +"/"+ questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the App to play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}