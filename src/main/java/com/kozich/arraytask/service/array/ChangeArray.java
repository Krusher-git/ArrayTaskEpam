package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ChangeArray {
    void changeAllPositiveElements(ArrayEntity arrayEntity);

    void changeAllEvenElements(ArrayEntity arrayEntity);

    void changePositionOfFirstElement(ArrayEntity arrayEntity);

}
