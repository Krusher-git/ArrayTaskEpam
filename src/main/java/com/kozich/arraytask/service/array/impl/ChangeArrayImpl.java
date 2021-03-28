package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.service.array.ChangeArray;

public class ChangeArrayImpl implements ChangeArray {

    public ChangeArrayImpl() {

    }

    public int[] changeAllPositiveElements(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] > 0) {
                currentArray[i] = -1;
            }
        }
        return currentArray;
    }

    public int[] changeAllEvenElements(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] % 2 == 0) {
                currentArray[i]++;
            }
        }
        return currentArray;
    }

    public int[] changePositionOfFirstElement(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
        for (int i = 0; i < currentArray.length; i++) {
            if (i != currentArray.length - 1) {
                int temp = currentArray[i];
                currentArray[i] = currentArray[i + 1];
                currentArray[i + 1] = temp;
            }
        }
        return currentArray;
    }
}
