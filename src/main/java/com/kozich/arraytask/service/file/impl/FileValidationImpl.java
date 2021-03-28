package com.kozich.arraytask.service.file.impl;

import com.kozich.arraytask.entity.file.FileInfo;
import com.kozich.arraytask.service.file.FileValidation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileValidationImpl implements FileValidation {
    public FileValidationImpl() {
    }

    public boolean isUseful(FileInfo fileInfo) throws IOException {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileInfo.toString());
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String check = scanner.nextLine();
                if (!check.matches("[a-z]+")) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return false;
    }
}
