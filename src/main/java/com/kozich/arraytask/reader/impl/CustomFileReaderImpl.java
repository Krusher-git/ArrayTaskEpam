package com.kozich.arraytask.reader.impl;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.reader.CustomFileReader;
import com.kozich.arraytask.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CustomFileReaderImpl implements CustomFileReader {
    static Logger logger = LogManager.getLogger();

    public String readFileLine(String path) throws ArrayException {
        if (!DataValidator.isFileUseful(path)) {
            logger.log(Level.ERROR, "File is not useful");
            throw new ArrayException("File does not exist or is not a file");
        }
        String arrayString = null;
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                String check = scanner.nextLine();
                if (DataValidator.isStringUseful(check)) {
                    arrayString = check;
                    break;
                }
            }
        } catch (IOException e) {
            throw new ArrayException("File doesn't exist", e.getCause());
        }

        if (arrayString == null) {
            throw new ArrayException("File doesn't match the condition");
        }
        return arrayString;
    }
}
