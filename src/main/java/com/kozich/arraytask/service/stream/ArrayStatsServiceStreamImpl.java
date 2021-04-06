package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ArrayStatsService;

import java.util.Arrays;

public class ArrayStatsServiceStreamImpl implements ArrayStatsService {

    public double calculateMiddleValue(ArrayEntity arrayEntity) {

        return Arrays.stream(arrayEntity.getCurrentArray())
                .average()
                .getAsDouble();
    }

    public int calculateSum(ArrayEntity arrayEntity) {

        return Arrays.stream(arrayEntity.getCurrentArray())
                .sum();
    }

    public int calculateAmountOfElements(ArrayEntity arrayEntity, boolean negative) {
        int result = (int) Arrays.stream(arrayEntity.getCurrentArray())
                .filter((current) -> current < 0)
                .count();
        if (!negative) {
            return arrayEntity.getCurrentArray().length - result;
        } else {
            return result;
        }
    }
}
