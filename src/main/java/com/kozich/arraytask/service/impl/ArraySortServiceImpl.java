package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {
    private final static Logger logger = LogManager.getLogger();

    public void bubbleSort(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int n = currentArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (currentArray[j] > currentArray[j + 1]) {
                    int temp = currentArray[j];
                    currentArray[j] = currentArray[j + 1];
                    currentArray[j + 1] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Sorted with bubble sort");
        arrayEntity.setCurrentArray(currentArray);
    }

    public void quickSort(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        if (currentArray.length <= 0) {
            return;
        }
        quickSortImpl(currentArray, 0, currentArray.length - 1);
        arrayEntity.setCurrentArray(currentArray);
        logger.log(Level.INFO, "Sorted with quick sort");
    }

    public void selectSort(ArrayEntity arrayEntity) {
        int[] currentArray = arrayEntity.getCurrentArray();
        int n = currentArray.length;
        for (int i = 0; i < n - 1; i++) {
            int current = i;
            for (int j = i + 1; j < n; j++) {
                if (currentArray[j] < currentArray[current]) {
                    current = j;
                }
            }
            int temp = currentArray[current];
            currentArray[current] = currentArray[i];
            currentArray[i] = temp;
        }
        logger.log(Level.INFO, "Sorted with select sort");
        arrayEntity.setCurrentArray(currentArray);
    }

    private void quickSortImpl(int[] currentArray, int left, int right) {
        int middle = (left + right) / 2;
        int middleValue = currentArray[middle];
        int i = left, j = right;
        while (i <= j) {
            while (currentArray[i] < middleValue) {
                i++;
            }
            while (currentArray[j] > middleValue) {
                j--;
            }
            if (i <= j) {
                int temp = currentArray[i];
                currentArray[i] = currentArray[j];
                currentArray[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSortImpl(currentArray, left, j);
        }
        if (right > i) {
            quickSortImpl(currentArray, i, right);
        }
    }
}
