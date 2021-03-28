package com.kozich.arraytask.service.array.impl;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.service.array.ArraySort;

public class ArraySortImpl implements ArraySort {
    public ArraySortImpl() {

    }

    public void bubbleSort(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
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
    }

    public void quickSort(ArrayForTask arrayForTask, int left, int right) {
        int[] currentArray = arrayForTask.getCurrentArray();
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
            quickSort(arrayForTask, left, j);

        if (right > i)
            quickSort(arrayForTask, i, right);
    }

    public void selectSort(ArrayForTask arrayForTask) {
        int[] currentArray = arrayForTask.getCurrentArray();
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
    }
}
