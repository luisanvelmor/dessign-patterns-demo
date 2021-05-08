package com.lveliz.designpatterns.solid.singleresponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class JournalPersistence {

    public static void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {

        if (overwrite || new File(fileName).exists()) {
            try (PrintStream out = new PrintStream(fileName)) {
                out.println(journal.toString());
            }
        }

    }

    public static File loadFile(String fileName) {
        // Lógica para cargar archivo
        throw new UnsupportedOperationException();
    }

}
