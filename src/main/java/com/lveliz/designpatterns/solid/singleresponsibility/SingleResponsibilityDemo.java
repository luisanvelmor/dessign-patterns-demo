package com.lveliz.designpatterns.solid.singleresponsibility;

public class SingleResponsibilityDemo {

    public static void main(String[] args) throws Exception {

        Journal journal = new Journal();
        journal.addEntry("Desayuné pancakes");
        journal.addEntry("Desarrolle una demo");
        System.out.println(journal);

        String fileName = "c:\\temp\\journal.txt";
        JournalPersistence.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);

    }

}
