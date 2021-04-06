package com.kozich.arraytask.main;

import com.kozich.arraytask.creator.Creator;
import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.parser.impl.ArrayParserImpl;
import com.kozich.arraytask.reader.impl.CustomFileReaderImpl;
import com.kozich.arraytask.service.impl.ArraySortServiceImpl;
import com.kozich.arraytask.service.impl.ArrayStatsServiceImpl;
import com.kozich.arraytask.service.impl.ChangeArrayServiceImpl;
import com.kozich.arraytask.service.impl.SearchElementsServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.URL;

public class TaskMain {
    private static final Logger logger = LogManager.getLogger();
    private static final String FILE_PATH = "data/resourceFile.txt";

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resourceURL = classLoader.getResource(FILE_PATH);
        String path = new File(resourceURL.getFile()).getAbsolutePath();
        CustomFileReaderImpl customFileReader = new CustomFileReaderImpl();
        String arrayLine;
        try {
            arrayLine = customFileReader.readFileLine(path);
            ArrayParserImpl arrayParser = new ArrayParserImpl();

            int[] array = arrayParser.receiveArrayFromString(arrayLine);
            Creator creator = new Creator();

            ArrayEntity arrayEntity = creator.createArrayEntity(array);
            ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();

            arraySortService.quickSort(arrayEntity);
            arraySortService.bubbleSort(arrayEntity);
            arraySortService.selectSort(arrayEntity);
            ArrayStatsServiceImpl statsService = new ArrayStatsServiceImpl();

            statsService.calculateAmountOfElements(arrayEntity, false);
            statsService.calculateMiddleValue(arrayEntity);
            statsService.calculateSum(arrayEntity);
            ChangeArrayServiceImpl changeArrayService = new ChangeArrayServiceImpl();

            changeArrayService.changeAllEvenElements(arrayEntity);
            changeArrayService.changeAllLargeElements(arrayEntity);
            SearchElementsServiceImpl searchElementsService = new SearchElementsServiceImpl();

            searchElementsService.findMaxElement(arrayEntity);
            searchElementsService.findMinElement(arrayEntity);
        } catch (ArrayException e) {
            logger.log(Level.ERROR, e);
        }

    }
}
