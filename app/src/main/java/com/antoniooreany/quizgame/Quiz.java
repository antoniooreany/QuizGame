package com.antoniooreany.quizgame;

class Quiz {

    private String question;

    private String[] answers;

    private int correctAnswerIndex;

    Quiz(String question, String[] answers, int correctAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    String[] getAnswers() {
        return answers;
    }

    String getQuestion() {
        return question;
    }

    String getCorrectAnswer() {
        return answers[correctAnswerIndex];
    }
}

