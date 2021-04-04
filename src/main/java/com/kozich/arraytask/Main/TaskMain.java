package com.kozich.arraytask.Main;

import com.kozich.arraytask.creator.Creator;
import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.parser.impl.ArrayParserImpl;
import com.kozich.arraytask.reader.impl.CustomFileReaderImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskMain {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String path = "src/main/resources/data/resourceFile.txt";
        CustomFileReaderImpl customFileReader = new CustomFileReaderImpl();
        String arrayLine = null;
        try {
            arrayLine = customFileReader.readFileLine(path);
        } catch (ArrayException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        ArrayParserImpl arrayParser = new ArrayParserImpl();
        int[] array = arrayParser.receiveArrayFromString(arrayLine);
        Creator creator = new Creator();
        ArrayEntity arrayEntity = creator.createArrayEntity(array);

//services;
    }
}
