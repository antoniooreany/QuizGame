package com.antoniooreany.quizgame;

import java.util.Random;

class QuizRepository {

    private Quiz[] quizzes;

    private static int answersNumber; //TODO trying to not hardcode ANSWERS_NUMBER in MainActivity

    /**
     *
     * a constructor which creates the quizzes, possible answers and points the correct answers
     */
    QuizRepository() {
        quizzes = new Quiz[]{
                new Quiz("How many people live in Mars? (Correct answer: 0)", new String[]{"0", "1", "2", "3"}, 0),
                new Quiz("How many dogs live in Mars? (Correct answer: 1)", new String[]{"0", "1", "2", "3"}, 1),
                new Quiz("How many dogs live in Mars? (Correct answer: 1)", new String[]{"0", "1", "2", "3"}, 1),
                new Quiz("How many mice live in Mars? (Correct answer: 3)", new String[]{"0", "1", "2", "3"}, 3)
        };
        answersNumber = quizzes[0].getAnswers().length; //TODO trying to not hardcode ANSWERS_NUMBER in MainActivity
    }

    /**
     *
     * @return some random quiz from the quizzes array
     */
    Quiz randomQuiz() {
        Random random = new Random();
        int i = random.nextInt(quizzes.length);
        return quizzes[i];
    }
}
