package com.kozich.arraytask.service;

import com.kozich.arraytask.array.ArrayForTask;

public class ArrayStats {


    public ArrayStats() {

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

    public int getAmountOfElements(boolean check, ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int amount = 0;
        for (int current : currentArray) {
            if (current < 0) {
                amount++;
            }
        }
        if (check) {
            return currentArray.length - amount;
        } else {
            return amount;
        }
    }

}
