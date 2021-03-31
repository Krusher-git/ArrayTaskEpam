package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;

import java.util.Arrays;

public class ArraySortInt {
    public void arraySort(ArrayEntity arrayEntity) {
        int[] currentArray = Arrays.stream(arrayEntity.getCurrentArray())
                .sorted()
                .toArray();
        arrayEntity.setCurrentArray(currentArray);
    }
}
