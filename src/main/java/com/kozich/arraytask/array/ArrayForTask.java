package com.kozich.arraytask.array;

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
        } else throw new IllegalArgumentException("Array is not exist");
    }

    public void setCurrentArray(int[] currentArray) {

        this.currentArray = currentArray;
    }

    private int[] arrayCopy() {
        int[] arrayReturn = currentArray;
        return arrayReturn;
    }

}
