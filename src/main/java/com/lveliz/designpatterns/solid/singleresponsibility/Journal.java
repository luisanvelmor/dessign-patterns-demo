package com.lveliz.designpatterns.solid.singleresponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public Journal() {
    }

    public void addEntry(String entry) {
        this.entries.add(count++ + ": " + entry);
    }

    public void removeEntry(int index) {
        this.entries.remove(index);
    }

    public List<String> getEntries() {
        return entries;
    }

    // No debería estar aquí
    // Está función debería de estar en otra clase dedicada a persistir en archivo
    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.entries);
    }

}
