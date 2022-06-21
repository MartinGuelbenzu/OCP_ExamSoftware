package classes;


import classes.GetQuestions;
import java.io.IOException;
import java.util.*;

public class TxtToJSON {

    public static void main(String[] args) throws IOException {
        //Should be executed everytime an update on Question class happens
        GetQuestions.readLines();
    }
}
