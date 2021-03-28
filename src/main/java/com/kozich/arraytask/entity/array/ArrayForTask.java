package com.kozich.arraytask.entity.array;

import com.kozich.arraytask.exception.ArrayException;

import java.util.Arrays;

public class ArrayForTask implements Cloneable {
    private int[] currentArray;


    public ArrayForTask() {

    }

    public ArrayForTask(int[] array) {
        this.currentArray = array;
    }

    public int[] getCurrentArray() {
        if (currentArray.length > 0) {
            return arrayCopy();
        } else try {
            throw new ArrayException("Error with array");
        } catch (ArrayException e) {
            e.printStackTrace();
        }
        return new int[]{0};
    }

    public void setCurrentArray(int[] currentArray) {

        this.currentArray = currentArray;
    }

    private int[] arrayCopy() {
        int[] arrayReturn = currentArray;
        return arrayReturn;
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        for (int i : getCurrentArray()) {
            line.append(i).append(", ");
        }
        return line.toString();
    }

}
