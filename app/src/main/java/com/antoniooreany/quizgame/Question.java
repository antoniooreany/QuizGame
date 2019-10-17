package com.antoniooreany.quizgame;

public class Question {

    private String query;

    private String[] answersArray;

    private int correctAnswerIndex;

    public Question(String query, String[] answersArray, int correctAnswerIndex) {
        this.query = query;
        this.answersArray = answersArray;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String[] getAnswersArray() {
        return answersArray;
    }

    public String getQuery() {
        return query;
    }

    public String getCorrectAnswer() {
        return answersArray[correctAnswerIndex];
    }
}

