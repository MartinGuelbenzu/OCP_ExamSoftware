/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Green
 */
public class Question {

    private int number;
    private int chapter;
    private String question;
    private List<String> options;
    private boolean answered = false, correct = false, questionHasImage = false, optionsHaveImage = false;
    private List<Integer> rightAnswers;
    private String explanation;

    public Question(int number, int chapter, String question, List<String> options) {
        this.number = number;
        this.chapter = chapter;
        this.question = question;
        this.options = options;
    }

    public boolean isQuestionHasImage() {
        return questionHasImage;
    }

    public void setQuestionHasImage(boolean questionHasImage) {
        this.questionHasImage = questionHasImage;
    }

    public boolean isOptionsHaveImage() {
        return optionsHaveImage;
    }

    public void setOptionsHaveImage(boolean optionsHaveImage) {
        this.optionsHaveImage = optionsHaveImage;
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

    public List<Integer> getRightAnswers() {
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

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void addAnswer(String answer) {
        options.add(answer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(chapter);
        sb.append(". ").append(number);
        sb.append(":\n").append(question);
        sb.append("\nOpciones: ").append(options);
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
