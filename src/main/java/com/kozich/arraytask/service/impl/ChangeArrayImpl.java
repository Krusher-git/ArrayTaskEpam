package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ChangeArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeArrayImpl implements ChangeArray {

    Logger logger = LogManager.getLogger();

    public void changeAllPositiveElements(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] > 0) {
                currentArray[i] = -1;
            }
        }
        logger.log(Level.INFO, "All positive elements have been changed");
    }

    public void changeAllEvenElements(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] % 2 == 0) {
                currentArray[i]++;
            }
        }
        logger.log(Level.INFO, "All even elements have been changed");
    }

    public void changePositionOfFirstElement(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (i != currentArray.length - 1) {
                int temp = currentArray[i];
                currentArray[i] = currentArray[i + 1];
                currentArray[i + 1] = temp;
            }
        }
        logger.log(Level.INFO, "Position of the frits element have been changed");
    }
}
