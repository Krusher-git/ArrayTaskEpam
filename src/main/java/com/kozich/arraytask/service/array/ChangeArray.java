package com.kozich.arraytask.service.array;

import com.kozich.arraytask.entity.array.ArrayForTask;

public interface ChangeArray {
    int[] changeAllPositiveElements(ArrayForTask arrayForTask);

    int[] changeAllEvenElements(ArrayForTask arrayForTask);

    int[] changePositionOfFirstElement(ArrayForTask arrayForTask);

}
