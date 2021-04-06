package com.kozich.arraytask.reader;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.reader.impl.CustomFileReaderImpl;
import com.kozich.arraytask.reader.impl.CustomFileReaderStreamImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class CustomFileReaderTest {
    private static final String FILE_PATH = "data/resourceFileTest.txt";
    private static final String INCORRECTFILE_PATH = "data/resourceFileIncorrectTest.txt";
    private CustomFileReaderImpl customFileReader;
    private CustomFileReaderStreamImpl customFileReaderStream;
    private String path;

    @BeforeClass
    public void setUp() {
        customFileReader = new CustomFileReaderImpl();
        customFileReaderStream = new CustomFileReaderStreamImpl();
    }

    @Test
    public void readFileLineTest() throws ArrayException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(FILE_PATH);
        path = new File(resourceURL.getFile()).getAbsolutePath();
        String expected = "5, 8, 10, 21";
        Assert.assertEquals(customFileReader.readFileLine(path), expected);
    }

    @Test
    public void readFileLineStreamTest() throws ArrayException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(FILE_PATH);
        path = new File(resourceURL.getFile()).getAbsolutePath();
        String expected = "5, 8, 10, 21";
        Assert.assertEquals(customFileReaderStream.readFileLine(path), expected);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void readFileLineFalseTest() throws ArrayException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(INCORRECTFILE_PATH);
        path = new File(resourceURL.getFile()).getAbsolutePath();
        customFileReader.readFileLine(path);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void readFileLineFalseStreamTest() throws ArrayException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(INCORRECTFILE_PATH);
        path = new File(resourceURL.getFile()).getAbsolutePath();
        customFileReaderStream.readFileLine(path);
    }
}
