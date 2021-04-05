package com.kozich.arraytask.parser;

import com.kozich.arraytask.parser.impl.ArrayParserImpl;
import com.kozich.arraytask.parser.impl.ArrayParserStreamImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayParserTest {
    private ArrayParserImpl arrayParser;
    private ArrayParserStreamImpl arrayParserStream;
    private final static String STRING_CHECK0 = "1, 2, 3, 4";
    private final static String STRING_CHECK1 = "3 - 5 - 7 - 10";
    private final static int[] ARRAY_CHECK0 = {1, 2, 3, 4};
    private final static int[] ARRAY_CHECK1 = {3, 5, 7, 10};

    @BeforeClass
    public void setUp() {
        arrayParser = new ArrayParserImpl();
        arrayParserStream = new ArrayParserStreamImpl();
    }

    @Test
    public void receiveArrayFromStringTest() {
        Assert.assertEquals(arrayParser.receiveArrayFromString(STRING_CHECK0), ARRAY_CHECK0);
    }

    @Test
    public void receiveArrayFromStringStreamTest() {
        Assert.assertEquals(arrayParserStream.receiveArrayFromString(STRING_CHECK1), ARRAY_CHECK1);
    }

}
