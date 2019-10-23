package com.antoniooreany.quizgame;

class Quiz {

    private String question;

    private String[] answers;

    private int correctAnswerIndex;

    /**
     * @param question           is a question to answer
     * @param answers            is an array of possible answers
     * @param correctAnswerIndex is the only one correct answer
     */
    Quiz(String question, String[] answers, int correctAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    /**
     * @return an array of possible answers
     */
    String[] getAnswers() {
        return answers;
    }

    /**
     * @return the question
     */
    String getQuestion() {
        return question;
    }

    /**
     * @return a correct answer
     */
    String getCorrectAnswer() {
        return answers[correctAnswerIndex];
    }
}

