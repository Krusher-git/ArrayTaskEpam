package com.kozich.arraytask.service.file.impl;

import com.kozich.arraytask.exception.ArrayException;
import com.kozich.arraytask.service.file.FileValidation;

import java.io.*;
import java.util.Scanner;

public class FileValidationImpl implements FileValidation {

    public boolean isUseful(String path) throws ArrayException {
        FileReader fileReader = null;
        try {
            File file = new File(path);
            if(!file.exists()){
                return false;
            }
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String check = scanner.nextLine();
                if (!check.matches("[a-z]+")) {
                    return true;
                }
            }
        } catch (IOException e) {
            throw new ArrayException("File doesn't exists", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
