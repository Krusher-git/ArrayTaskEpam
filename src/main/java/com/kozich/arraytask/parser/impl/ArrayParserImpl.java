package com.kozich.arraytask.parser.impl;

import com.kozich.arraytask.parser.ArrayParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayParserImpl implements ArrayParser {
    private static Logger logger = LogManager.getLogger();
    private static final String CONVERTER = "[^0-9]+";

    public int[] receiveArrayFromString(String arrayString) {
        String[] dividedArrayString = arrayString.split(CONVERTER);
        int n = dividedArrayString.length;
        int[] currentArray = new int[n];
        for (int i = 0; i < n; i++) {
            currentArray[i] = Integer.parseInt(dividedArrayString[i]);
        }
        logger.log(Level.INFO, "Array is created");
        return currentArray;
    }
}
