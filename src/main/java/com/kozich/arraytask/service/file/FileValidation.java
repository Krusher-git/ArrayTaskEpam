package com.kozich.arraytask.service.file;


import com.kozich.arraytask.exception.ArrayException;

public interface FileValidation {
    boolean isUseful(String path) throws ArrayException;
}
