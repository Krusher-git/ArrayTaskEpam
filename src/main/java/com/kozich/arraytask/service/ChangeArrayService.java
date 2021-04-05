package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;

public interface ChangeArrayService {
    void changeAllLargeElements(ArrayEntity arrayEntity);

    void changeAllEvenElements(ArrayEntity arrayEntity);


}
