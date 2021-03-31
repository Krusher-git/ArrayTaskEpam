package com.kozich.arraytask.parser;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.validator.FileValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileParser {
    static Logger logger = LogManager.getLogger();
    static final String CHECKER = "[^a-z]+";
    static final String CONVERTER = "[^0-9]+";
    public int[] receiveArrayFromFile(String path) throws ArrayException {
        if (!FileValidator.isUseful(path)) {
            logger.error("File is not useful");
            throw new ArrayException("File does not fit the condition");
        }
        FileReader fileReader = null;
        String arrayString = null;
        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            boolean match = false;
            while (!match) {
                String check = scanner.nextLine();
                if (check.matches(CHECKER)) {
                    arrayString = check;
                    match = true;
                }
            }
        } catch (IOException e) {
            throw new ArrayException("File doesn't exists", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    logger.error("Error with fileReader closing");
                }
            }
        }
        String[] splittedArrayString = arrayString.split(CONVERTER);
        int n = splittedArrayString.length;
        int[] currentArray = new int[n];
        for (int i = 0; i < n; i++) {
            currentArray[i] = Integer.parseInt(splittedArrayString[i]);
        }
        return currentArray;
    }
}
