package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ArrayStats {
    double getMiddleValue(ArrayEntity arrayEntity);

    int getSum(ArrayEntity arrayEntity);

    int getAmountOfElements(ArrayEntity arrayEntity, boolean check);
}
