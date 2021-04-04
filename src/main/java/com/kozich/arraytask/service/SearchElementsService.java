package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;

public interface SearchElementsService {
    int findMaxElement(ArrayEntity arrayEntity);

    int findMinElement(ArrayEntity arrayEntity);

}
