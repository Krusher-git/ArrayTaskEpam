package com.kozich.arraytask.entity;

import com.kozich.arraytask.exception.ArrayException;


public class ArrayEntity {
    private int[] currentArray;


    public ArrayEntity(int... array) {
        this.currentArray = array;
    }

    public int[] getCurrentArray() {
        if (currentArray == null) {
            /*TODO:
               Replace return null with smth useful
             */
            return null;
        }
        int[] givenArray = new int[currentArray.length];
        for (int i = 0; i < currentArray.length; i++) {
            givenArray[i] = currentArray[i];
        }
        return givenArray;
    }

    public void setCurrentArray(int... currentArray) {

        this.currentArray = currentArray;
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
