package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.ChangeArrayService;

import java.util.Arrays;

public class ChangeArrayServiceStreamImpl implements ChangeArrayService {
    public void changeAllLargeElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .map(s -> s > 100 ? 1 : s)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
    }

    public void changeAllEvenElements(ArrayEntity arrayEntity) {
        int[] resultArray = Arrays.stream(arrayEntity.getCurrentArray())
                .map(s -> s % 2 == 0 ? ++s : s)
                .toArray();
        arrayEntity.setCurrentArray(resultArray);
    }

}
