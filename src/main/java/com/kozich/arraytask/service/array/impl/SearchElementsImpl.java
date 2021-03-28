package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.service.array.SearchElements;

public class SearchElementsImpl implements SearchElements {


    public SearchElementsImpl() {

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
