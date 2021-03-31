package com.kozich.arraytask.reader;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.validator.FileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CustomFileReader {
    static Logger logger = LogManager.getLogger();
    static final String CHECKER = "[^a-z]+";

    public String readFileLine(String path) throws ArrayException {
        if (!FileValidator.isUseful(path)) {
            logger.log(Level.ERROR, "File is not useful");
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
                    logger.log(Level.ERROR, "Error with fileReader closing");
                }
            }
        }
        return arrayString;
    }
}
