package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ArraySortServiceStream;

import java.util.Arrays;

public class ArraySortServiceStreamImpl implements ArraySortServiceStream {
    public void arraySort(ArrayEntity arrayEntity) {
        int[] currentArray = Arrays.stream(arrayEntity.getCurrentArray())
                .sorted()
                .toArray();
        arrayEntity.setCurrentArray(currentArray);
    }
}
