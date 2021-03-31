package com.kozich.arraytask.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileParser {
    static Logger logger = LogManager.getLogger();
    static final String CONVERTER = "[^0-9]+";

    public int[] receiveArrayFromString(String arrayString) {

        String[] splittedArrayString = arrayString.split(CONVERTER);
        int n = splittedArrayString.length;
        int[] currentArray = new int[n];
        for (int i = 0; i < n; i++) {
            currentArray[i] = Integer.parseInt(splittedArrayString[i]);
        }
        logger.log(Level.INFO, "Array is created");
        return currentArray;
    }
}
