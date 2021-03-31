package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;

import java.util.Arrays;

public class ChangeArrayInt {
    public void changeAllPositiveElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .filter(s -> s > 0)
                .peek(s -> s = -1)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
    }
    public void changeAllEvenElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .filter(s -> s % 2 == 0)
                .peek(s -> s++)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
    }

}
