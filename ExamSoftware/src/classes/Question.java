/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Green
 */
public class Question {

    private int number;
    private int chapter;
    private String question;
    private boolean answered = false, correct = false;
    private ArrayList<Integer> rightAnswers ;
    private ArrayList<String> answers;
    private String explanation;

    public Question(int number, int chapter, String question, ArrayList<String> answers) {
        this.number = number;
        this.chapter = chapter;
        this.question = question;
        this.answers = answers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Integer> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(ArrayList<Integer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }
    
    public void addRightAnswer(Integer rightAnswer) {
        rightAnswers.add(rightAnswer);
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }


    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void addAnswer(String answer) {
        answers.add(answer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(chapter);
        sb.append(". ").append(number);
        sb.append(":\n").append(question);
        sb.append("\nOpciones: ").append(answers);
        return sb.toString();
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

}
