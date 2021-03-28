package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.service.array.ArrayStats;

public class ArrayStatsImpl implements ArrayStats {


    public ArrayStatsImpl() {

    }

    public double getMiddleValue(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int middleValue = 0;
        for (int current : currentArray) {
            middleValue += current;
        }

        return (double) middleValue / currentArray.length;
    }

    public int getSum(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int sum = 0;
        for (int current : currentArray) {
            sum += current;
        }
        return sum;
    }

    public int getAmountOfElements(ArrayForTask arrayForTask, boolean negative) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int amount = 0;
        for (int current : currentArray) {
            if (current < 0) {
                amount++;
            }
        }
        if (!negative) {
            return currentArray.length - amount;
        } else {
            return amount;
        }
    }

}
