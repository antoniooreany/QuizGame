package com.antoniooreany.quizgame;

import java.util.Random;

class QuizRepository {

    private final int numberOfAnswers;
    private Quiz[] quizzes;

    /**
     * a constructor which creates the quizzes, possible answers and points the correct answers
     */
    QuizRepository() {
        String[] answers = {"0", "1", "2", "3"};
        quizzes = new Quiz[]{
                new Quiz("How many people live in Mars? (Correct answer: 0)", answers, 0),
                new Quiz("How many dogs live in Mars? (Correct answer: 1)", answers, 1),
                new Quiz("How many dogs live in Mars? (Correct answer: 2)", answers, 2),
                new Quiz("How many mice live in Mars? (Correct answer: 3)", answers, 3)
        };
        numberOfAnswers = answers.length;
    }

    /**
     * @return numberOfAnswers
     */
    int getNumberOfAnswers() {
        return numberOfAnswers;
    }

    /**
     * @return some random quiz from the quizzes array
     */
    Quiz randomQuiz() {
        Random random = new Random();
        int i = random.nextInt(quizzes.length);
        return quizzes[i];
    }
}
