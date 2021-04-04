package com.kozich.arraytask.parser.impl;

import com.kozich.arraytask.parser.ArrayParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayParserStreamImpl implements ArrayParser {
    private static Logger logger = LogManager.getLogger();
    private static final String CONVERTER = "[^0-9]+";

    public int[] receiveArrayFromString(String arrayString) {
        String[] dividedArrayString = arrayString.split(CONVERTER);
        int n = dividedArrayString.length;
        int[] currentArray = new int[n];
        try {
            currentArray = Arrays.stream(dividedArrayString)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR, "Error with array", e);
        }
        logger.log(Level.INFO, "Array is created");
        return currentArray;
    }
}
