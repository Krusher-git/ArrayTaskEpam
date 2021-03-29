package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.array.ArrayStats;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayStatsImpl implements ArrayStats {

    static Logger logger = LogManager.getLogger();

    public double getMiddleValue(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int middleValue = 0;
        for (int current : currentArray) {
            middleValue += current;
        }
        logger.info("Middle value is " + ((double) middleValue / currentArray.length));
        return (double) middleValue / currentArray.length;
    }

    public int getSum(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int sum = 0;
        for (int current : currentArray) {
            sum += current;
        }
        return sum;
    }

    public int getAmountOfElements(ArrayEntity arrayEntity, boolean negative) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int amount = 0;
        for (int current : currentArray) {
            if (current < 0) {
                amount++;
            }
        }
        if (!negative) {
            logger.info("The amount of positive elements is " + (currentArray.length - amount));
            return currentArray.length - amount;
        } else {
            logger.info("The amount of negative elements is " + amount);
            return amount;
        }
    }

}
