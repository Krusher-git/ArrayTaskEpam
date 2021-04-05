package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ArrayStatsService {
    double calculateMiddleValue(ArrayEntity arrayEntity);

    int calculateSum(ArrayEntity arrayEntity);

    int calculateAmountOfElements(ArrayEntity arrayEntity, boolean check);
}
