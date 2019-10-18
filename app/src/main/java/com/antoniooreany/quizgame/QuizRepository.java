package com.antoniooreany.quizgame;

import java.util.Random;

public class QuizRepository {

    private Quiz[] quizzes;

    public QuizRepository() {
        Quiz quiz0 = new Quiz("How many people live in Mars?", new String[]{"0", "1", "2", "3"}, 0);
        Quiz quiz1 = new Quiz("How many dogs live in Mars?", new String[]{"0", "1", "2", "3"}, 0);
        Quiz quiz2 = new Quiz("How many cats live in Mars?", new String[]{"0", "1", "2", "3"}, 0);
        Quiz quiz3 = new Quiz("How many mice live in Mars?", new String[]{"0", "1", "2", "3"}, 0);
        quizzes = new Quiz[]{quiz0, quiz1, quiz2, quiz3};
    }

    public Quiz[] getQuizzes() {
        return quizzes;
    }

    public Quiz randomQuiz() {
        Random random = new Random();
        int i = random.nextInt(quizzes.length);
        return quizzes[i];

    }
}
