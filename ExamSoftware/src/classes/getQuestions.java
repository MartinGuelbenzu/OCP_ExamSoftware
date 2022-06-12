/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Question;
import static classes.getAndAssignCorrectAnswer.getAndAssignCorrectAnswer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Green
 */
public class getQuestions {

    /**
     * This will print the documents text page by page.
     *
     * @throws java.io.FileNotFoundException
     *
     * @throws IOException If there is an error parsing or extracting the
     * document.
     */
//    
    public static ArrayList<Question> readLines() throws FileNotFoundException {

        ArrayList<Question> preguntas = new ArrayList<>();
        try {
            File file = new File("parsedQuestions.txt");
            Scanner sc = new Scanner(file);

            StringBuilder enunciado = new StringBuilder("");
            ArrayList<String> answers = new ArrayList();

            String line = null;
            boolean answ = false, enounc = false;
            int num = 0, chap = 0;

            while (sc.hasNextLine()) {
                line = sc.nextLine();

                if (line.matches("\\d{1,4}\\.{1}.*")) {
                    if (answ) {
                        answ = false;
                        preguntas.add(new Question(num, chap, enunciado.toString(), answers));
                        answers = new ArrayList();
                        enunciado = new StringBuilder("");

                    }
                    enounc = true;
                    num++;
                    if (line.substring(0, 3).equals("1. ")) {
                        num = 1;
                        chap++;
                    }
                }
                if (line.matches("[A-F]\\.{1}.*")) {
                    answ = true;
                    enounc = false;
                }
                if (enounc) {
                    if (line.matches("\\d{1,4}\\.{1}.*")) {
                        enunciado = enunciado.append(line.substring(line.indexOf(" ") + 1));
                    } else {
                        enunciado = enunciado.append("\n" + line);
                    }
                }
                if (answ) {
                    if (line.matches("[A-F]\\.{1}.*")) {
                        answers.add(line.substring(line.indexOf(" ") + 1));
                    } else {
                        answ = false;
                        preguntas.add(new Question(num, chap, enunciado.toString(), answers));
                        answers = new ArrayList();
                        enunciado = new StringBuilder("");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return getAndAssignCorrectAnswer(preguntas);
    }
}
