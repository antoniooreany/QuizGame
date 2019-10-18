package com.antoniooreany.quizgame;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private QuizRepository quizRepository;
    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizRepository = new QuizRepository();
        randomQuestionInit(quizRepository);

        setOnClickListeners();
    }

    private void randomQuestionInit(QuizRepository quizRepository) {
        quiz = quizRepository.randomQuiz();

        TextView question = findViewById(R.id.question);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        question.setText(quiz.getQuestion());
        button0.setText(quiz.getAnswers()[0]);
        button1.setText(quiz.getAnswers()[1]);
        button2.setText(quiz.getAnswers()[2]);
        button3.setText(quiz.getAnswers()[3]);

        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
    }

    private void setOnClickListeners() {

        button0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = String.valueOf(button0.getText());
                String correctAnswer = String.valueOf(quiz.getCorrectAnswer());
                if (answer.equals(correctAnswer)) {
                    randomQuestionInit(quizRepository);
                } else {
                    button0.setEnabled(false);
                }
                Log.i("button0.getText()", answer);
                Log.i("quiz.getCorrectAnswer()", correctAnswer);
            }
        });

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = String.valueOf(button1.getText());
                String correctAnswer = String.valueOf(quiz.getCorrectAnswer());
                if (answer.equals(correctAnswer)) {
                    randomQuestionInit(quizRepository);
                } else {
                    button1.setEnabled(false);
                }
                Log.i("button1.getText()", answer);
                Log.i("quiz.getCorrectAnswer()", correctAnswer);
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = String.valueOf(button2.getText());
                String correctAnswer = String.valueOf(quiz.getCorrectAnswer());
                if (answer.equals(correctAnswer)) {
                    randomQuestionInit(quizRepository);
                } else {
                    button2.setEnabled(false);
                }
                Log.i("button2.getText()", answer);
                Log.i("quiz.getCorrectAnswer()", correctAnswer);
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = String.valueOf(button3.getText());
                String correctAnswer = String.valueOf(quiz.getCorrectAnswer());
                if (answer.equals(correctAnswer)) {
                    randomQuestionInit(quizRepository);
                } else {
                    button3.setEnabled(false);
                }
                Log.i("button3.getText()", answer);
                Log.i("quiz.getCorrectAnswer()", correctAnswer);
            }
        });

//        button1.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button1.setEnabled(false);
//            }
//        });
//
//        button2.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button2.setEnabled(false);
//            }
//        });
//
//        button3.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button3.setEnabled(false);
//            }
//        });
    }
}
