/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Green
 */
public class JSON {

    final String backup = "output.json";

    public static void saveToJSON(List<Question> preguntas) {
        StringBuilder json = new StringBuilder("");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (Question q : preguntas) {

            json = json.append(gson.toJson(q) + "\n");

        }
        Path path = Paths.get("backup");

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            gson.toJson(preguntas, writer);
        } catch (IOException e) {
            System.out.println("Problemas con el JSON");
        }
    }

    public static List<Question> loadFromJSON(List<Question> preguntas) {

        //  Carga de preguntas y respuestas
        Gson gson = new GsonBuilder().create();

        String fileName = "\\output.json";
        Path path = new File(new File("").getAbsolutePath() + fileName).toPath();

        try (Reader reader = Files.newBufferedReader(path)) {

            Question[] quests = gson.fromJson(reader, Question[].class);

            preguntas = Arrays.asList(quests);
        } catch (Exception e) {
            System.out.println("Error JSON");
        }
        return preguntas;
    }
}
