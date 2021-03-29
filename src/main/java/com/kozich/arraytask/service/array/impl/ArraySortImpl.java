package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.array.ArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortImpl implements ArraySort {
    static Logger logger = LogManager.getLogger();

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
        logger.info("Sorted with bubble sort");
    }

    public void quickSort(ArrayEntity arrayEntity, int left, int right) {
        int[] currentArray = arrayEntity.getCurrentArray();
        if (currentArray.length == 0) {
            return;
        }
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
        if (left < j)
            quickSort(arrayEntity, left, j);

        if (right > i)
            quickSort(arrayEntity, i, right);
        logger.info("Sorted with quick sort");
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
        logger.info("Sorted with select sort");
    }
}
