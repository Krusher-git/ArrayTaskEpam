package com.kozich.arraytask.service.impl;

import com.kozich.arraytask.entity.ArrayEntity;

import java.util.Arrays;

public class ArrayStatsInt {
    public double getMiddleValue(ArrayEntity arrayEntity) {

        return Arrays.stream(arrayEntity.getCurrentArray())
                .average()
                .getAsDouble();
    }

    public int getSum(ArrayEntity arrayEntity) {
        return Arrays.stream(arrayEntity.getCurrentArray())
                .sum();
    }

    public int getAmountOfElements(ArrayEntity arrayEntity, boolean negative) {
        int result = (int) Arrays.stream(arrayEntity.getCurrentArray())
                .filter((current) -> current > 0)
                .count();
        if (!negative) {
            return arrayEntity.getCurrentArray().length - result;
        } else {
            return result;
        }
    }
}
