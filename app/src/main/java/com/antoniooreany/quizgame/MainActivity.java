package com.antoniooreany.quizgame;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons;
    private QuizRepository quizRepository;
    private Quiz quiz;

    /**
     * Method call when the application is created.
     *
     * @param savedInstanceState is inherited parameter
     *                           executes when application is created
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizRepository = new QuizRepository();
        buttons = new Button[quizRepository.getNumberOfAnswers()];
        randomQuestionInit(quizRepository);

        setOnClickListeners();
    }

    /**
     * Random quiz generator.
     *
     * @param quizRepository is a quiz repository, from which take some random quiz for putting the quiz data into UI.
     */
    private void randomQuestionInit(QuizRepository quizRepository) {
        quiz = quizRepository.randomQuiz();

        TextView question = findViewById(R.id.question);
        question.setText(quiz.getQuestion());

        for (int i = 0; i < buttons.length; i++) {
            String buttonID = "button" + i;
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            buttons[i] = findViewById(resID);
            buttons[i].setText(quiz.getAnswers()[i]);
            buttons[i].setEnabled(true);
        }
    }

    /**
     * Sets an onClickListeners for the buttons.
     */
    private void setOnClickListeners() {
        for (int i = 0; i < buttons.length; i++) {
            final int finalI = i;
            buttons[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String answer = String.valueOf(buttons[finalI].getText());
                    String correctAnswer = String.valueOf(quiz.getCorrectAnswer());
                    if (answer.equals(correctAnswer)) randomQuestionInit(quizRepository);
                    else buttons[finalI].setEnabled(false);
                }
            });
        }
    }
}
