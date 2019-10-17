package com.antoniooreany.quizgame;

import java.util.ArrayList;
import java.util.Random;

public class QuestionRepository {

    private ArrayList<Question> questionList;

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public QuestionRepository() {
        String[] answers = {"0", "1", "2", "3"};
        Question question0 = new Question("How many people live in Mars?", answers, 0);
        Question question1 = new Question("How many dogs live in Mars?", answers, 0);
        Question question2 = new Question("How many cats live in Mars?", answers, 0);
        Question question3 = new Question("How many mice live in Mars?", answers, 0);
        questionList = new ArrayList<>();
        questionList.add(question0);
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
    }

    public Question randomQuestion() {
        Random random = new Random();
        int i = random.nextInt(questionList.size());
        return questionList.get(i);

    }
}
