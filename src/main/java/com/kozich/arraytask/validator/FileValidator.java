package com.kozich.arraytask.validator;

import com.kozich.arraytask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileValidator {
    static Logger logger = LogManager.getLogger();
    static final String CHECKER = "[^a-z]+";

    static public boolean isUseful(String path) throws ArrayException {
        FileReader fileReader = null;
        try {
            File file = new File(path);
            if (!file.exists()) {
                return false;
            }
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String check = scanner.nextLine();
                if (check.matches(CHECKER)) {
                    return true;
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
        return false;
    }
}
