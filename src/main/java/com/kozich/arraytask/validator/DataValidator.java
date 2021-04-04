package com.kozich.arraytask.validator;


import java.io.File;

public class DataValidator {
    private static final String REGEXP = "^[\\d[,\\s-]]+$";

    static public boolean isFileUseful(String path) {
        File file = new File(path);
        boolean result = file.exists() && file.isFile();
        return result;
    }

    static public boolean isStringUseful(String arrayString) {
        boolean result = arrayString.matches(REGEXP);
        return result;
    }

}
