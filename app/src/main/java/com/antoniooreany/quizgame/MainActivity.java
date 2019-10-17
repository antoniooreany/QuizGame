package com.antoniooreany.quizgame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Question randomQuestion;
    private QuestionRepository questionRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionRepository = new QuestionRepository();
        newQuestionInit(questionRepository);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                button0.setEnabled(true);
                newQuestionInit(questionRepository);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setEnabled(false);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setEnabled(false);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setEnabled(false);
            }
        });

    }

    private void newQuestionInit(QuestionRepository questionRepository) {
        randomQuestion = questionRepository.randomQuestion();

        TextView query = findViewById(R.id.query);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        query.setText(randomQuestion.getQuery());
        button0.setText(randomQuestion.getAnswersArray()[0]);
        button1.setText(randomQuestion.getAnswersArray()[1]);
        button2.setText(randomQuestion.getAnswersArray()[2]);
        button3.setText(randomQuestion.getAnswersArray()[3]);

        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
    }


}
