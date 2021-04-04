package com.kozich.arraytask.service.stream;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.SearchElementsService;

import java.util.Arrays;

public class SearchElementsServiceStreamImpl implements SearchElementsService {
    public int findMaxElement(ArrayEntity arrayEntity) {
        return Arrays.stream(arrayEntity.getCurrentArray())
                .max()
                .getAsInt();
    }

    public int findMinElement(ArrayEntity arrayEntity) {
        return Arrays.stream(arrayEntity.getCurrentArray())
                .min()
                .getAsInt();
    }
}
