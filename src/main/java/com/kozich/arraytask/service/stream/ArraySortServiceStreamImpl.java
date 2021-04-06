package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ArraySortServiceStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySortServiceStreamImpl implements ArraySortServiceStream {
    private final static Logger logger = LogManager.getLogger();

    public void arraySort(ArrayEntity arrayEntity) {
        int[] currentArray = Arrays.stream(arrayEntity.getCurrentArray())
                .sorted()
                .toArray();
        logger.log(Level.INFO, " Array sorted");
        arrayEntity.setCurrentArray(currentArray);
    }
}
