/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Green
 */
public class pdfToTxt {

//    public static void main(String[] args) throws IOException {
//
//        //doNotExecute();
//
//    }
//
//    public static void doNotExecute() throws IOException {
//        String fileName = "C:\\Users\\Green\\Documents\\JAVA PUE\\BateriaExamen.pdf";
//        StringBuilder fullText = new StringBuilder("");
//
//        try (PDDocument document = Loader.loadPDF(new File(fileName))) {
//            AccessPermission ap = document.getCurrentAccessPermission();
//            if (!ap.canExtractContent()) {
//                throw new IOException("You do not have permission to extract text");
//            }
//
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter("parsedAnswers.txt"))) {
//
//                PDFTextStripper stripper = new PDFTextStripper();
//
//                //stripper.setSortByPosition(true);
//                for (int p = 442; p <= 567; ++p) {
//                    // Set the page interval to extract. If you don't, then all pages would be extracted.
//                    stripper.setStartPage(p);
//                    stripper.setEndPage(p);
//
//                    // let the magic happen
//                    String text = stripper.getText(document);
//
//                    // Write page String in txt                    
//                    bw.write(text.trim());
//                    bw.flush();
//                }
//            }
//        }
//    }
}
