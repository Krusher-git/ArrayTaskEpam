package com.kozich.arraytask.entity.file;

import com.kozich.arraytask.entity.array.ArrayForTask;

import java.io.File;

public class FileInfo {
    private File file;
    private ArrayForTask arrayForTask;

    FileInfo() {

    }

    public File getFile() {
        if (file.exists()) {
            return file;
        } else return null;

    }

    @Override
    public String toString() {
        return file.getPath();
    }

    public void setFile(File file) {
        this.file = file;
    }
}
