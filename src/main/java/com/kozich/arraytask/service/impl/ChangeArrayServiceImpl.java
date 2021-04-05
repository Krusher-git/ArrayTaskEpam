package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ChangeArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeArrayServiceImpl implements ChangeArrayService {

    private static final Logger logger = LogManager.getLogger();

    public void changeAllLargeElements(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] > 100) {
                currentArray[i] = 1;
            }
        }
        logger.log(Level.INFO, "All elements larger then 100 have been changed");
        arrayEntity.setCurrentArray(currentArray);
    }

    public void changeAllEvenElements(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] % 2 == 0) {
                currentArray[i]++;
            }
        }
        logger.log(Level.INFO, "All even elements have been changed");
        arrayEntity.setCurrentArray(currentArray);
    }


}
