package com.kozich.arraytask.validator;


import java.io.File;

public class DataValidator {
    private static final String CORRECT_FORM = "^[\\d[,\\s-]]+$";

    public static boolean isFileUseful(String path) {
        File file = new File(path);
        boolean result = file.exists() && file.isFile();
        return result;
    }

    public static boolean isStringUseful(String arrayString) {
        boolean result = false;
        if (arrayString == null) {
            return result;
        }
        result = arrayString.matches(CORRECT_FORM);
        return result;
    }

}
