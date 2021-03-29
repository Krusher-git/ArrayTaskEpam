package com.kozich.arraytask.service.file;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.exception.ArrayException;

import java.io.IOException;

public interface FileEditor {
    void readFromFile(String path) throws ArrayException;

    void writeIntoFile(String path, ArrayEntity arrayEntity) throws ArrayException;
}
