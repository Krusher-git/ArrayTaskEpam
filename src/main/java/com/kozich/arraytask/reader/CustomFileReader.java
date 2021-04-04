package com.kozich.arraytask.reader;

import com.kozich.arraytask.exception.ArrayException;

public interface CustomFileReader {
    String readFileLine(String path) throws ArrayException;
}
