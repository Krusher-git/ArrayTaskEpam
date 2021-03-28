package com.kozich.arraytask.service.file.impl;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.entity.file.FileInfo;
import com.kozich.arraytask.service.file.FileEditor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEditorImpl implements FileEditor {
    public FileEditorImpl() {
    }

    public void readFromFile(FileInfo fileInfo) throws IOException {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileInfo.toString());
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

    }

    public void writeIntoFile(FileInfo fileInfo, ArrayForTask arrayForTask) throws IOException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileInfo.toString());
            fileWriter.write(arrayForTask.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }


}
