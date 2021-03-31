package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;

import java.util.Arrays;

public class SearchElementsInt {
    public int findMaxElement(ArrayEntity arrayEntity) {
        return Arrays.stream(arrayEntity.getCurrentArray())
                .max()
                .getAsInt();
    }
    public int findMinElement(ArrayEntity arrayEntity) {
        return  Arrays.stream(arrayEntity.getCurrentArray())
                .min()
                .getAsInt();
    }
}
