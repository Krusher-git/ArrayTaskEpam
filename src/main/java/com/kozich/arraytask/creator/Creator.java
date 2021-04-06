package com.kozich.arraytask.creator;

import com.kozich.arraytask.entity.ArrayEntity;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Creator {
    private static Logger logger = LogManager.getLogger();

    public ArrayEntity createArrayEntity(int... currentArray) {
        int[] temporaryArray = currentArray.clone();
        ArrayEntity arrayEntity = new ArrayEntity(temporaryArray);
        logger.log(Level.INFO, "ArrayEntity is created");
        return arrayEntity;
    }
}
