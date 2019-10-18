package com.antoniooreany.quizgame;

public class Quiz {

    private String question;

    private String[] answers;

    private int correctAnswerIndex;

    public Quiz(String question, String[] answers, int correctAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return answers[correctAnswerIndex];
    }
}

