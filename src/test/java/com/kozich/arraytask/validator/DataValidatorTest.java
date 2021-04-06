package com.kozich.arraytask.validator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class DataValidatorTest {
    private static final String FILE_PATH = "data/resourceFileTest.txt";
    private static final String STRING_ARRAY = "1, 3, 5";
    private static final String INCORRECT_STRING_ARRAY = "1, 3z, 5";
    private String path;

    @BeforeClass
    public void setUp() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(FILE_PATH);
        path = new File(resourceURL.getFile()).getAbsolutePath();
    }

    @Test
    public void isFileUsefulTest() {
        Assert.assertTrue(DataValidator.isFileUseful(path));
    }

    @Test
    public void isStringUsefulTrueTest() {

        Assert.assertTrue(DataValidator.isStringUseful(STRING_ARRAY));
    }

    @Test
    public void isStringUsefulFalseTest() {
        Assert.assertFalse(DataValidator.isStringUseful(INCORRECT_STRING_ARRAY));
    }
}
