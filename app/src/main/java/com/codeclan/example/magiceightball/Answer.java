package com.codeclan.example.magiceightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 23/02/2017.
 */

public class Answer implements Answerable {
    private ArrayList<String> answers;

    public Answer() {
        this.answers = new ArrayList<String>();
        setUpAnswers();
    }

    public Answer(ArrayList<String> answers) {
        this.answers = new ArrayList<String>(answers);
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(answers);
    }

    public int getLength(){
        return this.answers.size();
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    @Override
    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int randomInt = rand.nextInt(listSize);
        return this.answers.get(randomInt);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void setUpAnswers(){
        String[] answersToAdd = {"Yes!", "No!", "I love my brick!"};
        for(String answer : answersToAdd){
            addAnswer(answer);
        }
    }
}
