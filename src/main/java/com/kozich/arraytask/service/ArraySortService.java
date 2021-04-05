package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ArraySortService {
    void bubbleSort(ArrayEntity arrayEntity);

    void quickSort(ArrayEntity arrayEntity);

    void selectSort(ArrayEntity arrayEntity);
}
