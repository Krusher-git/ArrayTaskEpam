package com.kozich.arraytask.service;

import com.kozich.arraytask.array.ArrayForTask;

public class SearchElementsInArray {


    public SearchElementsInArray() {

    }

    public int findMaxElement(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int max = currentArray[0];
        for (int currentValue : currentArray) {
            if (max < currentValue) {
                max = currentValue;
            }
        }
        return max;
    }

    public int findMinElement(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        int min = currentArray[0];
        for (int currentValue : currentArray) {
            if (min > currentValue) {
                min = currentValue;
            }
        }
        return min;
    }
}
