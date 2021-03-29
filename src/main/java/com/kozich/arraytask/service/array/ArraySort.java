package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ArraySort {
    void bubbleSort(ArrayEntity arrayEntity);

    void quickSort(ArrayEntity arrayEntity, int left, int right);

    void selectSort(ArrayEntity arrayEntity);
}
