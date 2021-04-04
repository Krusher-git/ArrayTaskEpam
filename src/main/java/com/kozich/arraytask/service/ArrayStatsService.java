package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ArrayStatsService {
    double getMiddleValue(ArrayEntity arrayEntity);

    int getSum(ArrayEntity arrayEntity);

    int getAmountOfElements(ArrayEntity arrayEntity, boolean check);
}
