package com.kozich.arraytask.entity;


import java.util.Arrays;

public class ArrayEntity {
    private int[] currentArray;

    public ArrayEntity(int... array) {

        this.currentArray = array;
    }

    public int[] getCurrentArray() {
        return currentArray.clone();
    }

    public void setCurrentArray(int... currentArray) {

        this.currentArray = currentArray.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrayEntity that = (ArrayEntity) o;
        return Arrays.equals(getCurrentArray(), that.getCurrentArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentArray());
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
