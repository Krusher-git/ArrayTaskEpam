package com.kozich.arraytask.service.file.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.service.file.FileEditor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEditorImpl implements FileEditor {

    static Logger logger = LogManager.getLogger();

    public void readFromFile(String path) throws ArrayException {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new ArrayException("Error with file", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    logger.error(e);
                }
            }
        }

    }

    public void writeIntoFile(String path, ArrayEntity arrayEntity) throws ArrayException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write(arrayEntity.toString());
        } catch (IOException e) {
            throw new ArrayException("Error with file", e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    logger.error(e);
                }
            }
        }

    }


}
