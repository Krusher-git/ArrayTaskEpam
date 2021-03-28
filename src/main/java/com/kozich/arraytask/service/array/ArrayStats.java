package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.array.ArrayForTask;

public interface ArrayStats {
    double getMiddleValue(ArrayForTask arrayForTask);

    int getSum(ArrayForTask arrayForTask);

    int getAmountOfElements(ArrayForTask arrayForTask, boolean check);
}
