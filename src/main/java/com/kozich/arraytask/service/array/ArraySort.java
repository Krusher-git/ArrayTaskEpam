package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.array.ArrayForTask;

public interface ArraySort {
    void bubbleSort(ArrayForTask arrayForTask);

    void quickSort(ArrayForTask arrayForTask, int left, int right);

    void selectSort(ArrayForTask arrayForTask);
}
