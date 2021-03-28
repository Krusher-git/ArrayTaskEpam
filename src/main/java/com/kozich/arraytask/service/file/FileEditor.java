package com.kozich.arraytask.service.file;

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.entity.file.FileInfo;

import java.io.IOException;

public interface FileEditor {
    void readFromFile(FileInfo fileInfo) throws IOException;

    void writeIntoFile(FileInfo fileInfo, ArrayForTask arrayForTask) throws IOException;
}
