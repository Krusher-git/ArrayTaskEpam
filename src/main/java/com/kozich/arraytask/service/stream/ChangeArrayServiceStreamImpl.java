package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ChangeArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ChangeArrayServiceStreamImpl implements ChangeArrayService {
    private final static Logger logger = LogManager.getLogger();

    public void changeAllLargeElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .map(s -> s > 100 ? 1 : s)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
        logger.log(Level.INFO, "Changed all elements larger than 100");
    }

    public void changeAllEvenElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .map(s -> s % 2 == 0 ? ++s : s)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
        logger.log(Level.INFO, "Changed all even elements");
    }

}
