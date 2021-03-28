package com.kozich.arraytask.service.file;

import com.kozich.arraytask.entity.file.FileInfo;

import java.io.IOException;

public interface FileValidation {
    boolean isUseful(FileInfo fileInfo) throws IOException;
}
