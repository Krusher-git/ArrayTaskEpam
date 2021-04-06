package com.kozich.arraytask.reader.impl;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.reader.CustomFileReader;
import com.kozich.arraytask.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class CustomFileReaderStreamImpl implements CustomFileReader {
    private static Logger logger = LogManager.getLogger();

    public String readFileLine(String path) throws ArrayException {
        if (!DataValidator.isFileUseful(path)) {
            logger.log(Level.ERROR, "File is not useful");
            throw new ArrayException("File is not useful");
        }
        String arrayString = null;
        Path filePath = Paths.get(path);
        try (Stream<String> fileLines = Files.lines(filePath)) {
            arrayString = fileLines.filter(DataValidator::isStringUseful)
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            throw new ArrayException("File does not exist or is not a file", e);
        }
        if (arrayString == null) {
            throw new ArrayException("File doesn't match the condition");
        }
        return arrayString;
    }
}
