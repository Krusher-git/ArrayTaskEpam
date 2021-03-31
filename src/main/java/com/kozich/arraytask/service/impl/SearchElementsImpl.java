package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.SearchElements;

public class SearchElementsImpl implements SearchElements {


    public int findMaxElement(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int max = currentArray[0];
        for (int currentValue : currentArray) {
            if (max < currentValue) {
                max = currentValue;
            }
        }
        return max;
    }

    public int findMinElement(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int min = currentArray[0];
        for (int currentValue : currentArray) {
            if (min > currentValue) {
                min = currentValue;
            }
        }
        return min;
    }
}
