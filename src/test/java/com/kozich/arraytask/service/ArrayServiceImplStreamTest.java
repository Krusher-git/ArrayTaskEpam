package com.kozich.arraytask.service;

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.impl.SearchElementsServiceImpl;
import com.kozich.arraytask.service.stream.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceImplStreamTest {
    private ArrayEntity arrayEntity;
    private ArrayStatsServiceStreamImpl arrayStatsService;
    private ArraySortServiceStreamImpl arraySort;
    private ChangeArrayServiceStreamImpl changeArray;

    @BeforeClass
    public void setUp() {
        arrayEntity = new ArrayEntity();
        arrayStatsService = new ArrayStatsServiceStreamImpl();
        arraySort = new ArraySortServiceStreamImpl();
        changeArray = new ChangeArrayServiceStreamImpl();

    }

    @Test
    public void calculateSumTest() {
        int[] currentArray = {1, 2, 3, 4, 5, 6, 7};
        int expected = 28;
        arrayEntity.setCurrentArray(currentArray);
        assertEquals(arrayStatsService.calculateSum(arrayEntity), expected);
    }

    @Test
    public void calculateMiddleValueTest() {
        int[] currentArray = {1, 3, 5, 6};
        double expected = 3.75;
        arrayEntity.setCurrentArray(currentArray);
        assertEquals(arrayStatsService.calculateMiddleValue(arrayEntity), expected);
    }

    @Test
    public void calculateAmountOfElementsTest() {
        int[] currentArray = {-11, 3, 5, 6};
        int expected = 1;
        arrayEntity.setCurrentArray(currentArray);
        assertEquals(arrayStatsService.calculateAmountOfElements(arrayEntity, true), expected);
    }

    @Test
    public void findMaxElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 18;
        arrayEntity.setCurrentArray(currentArray);
        SearchElementsServiceImpl searchElements = new SearchElementsServiceImpl();
        assertEquals(searchElements.findMaxElement(arrayEntity), expected);
    }

    @Test
    public void findMinElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 0;
        arrayEntity.setCurrentArray(currentArray);
        SearchElementsServiceImpl searchElements = new SearchElementsServiceImpl();
        assertEquals(searchElements.findMinElement(arrayEntity), expected);
    }

    @Test
    public void changeAllLargeElementsTest() {
        int[] currentArray = {101, 3, 5, 18, 10, 13};
        int[] expected = {1, 3, 5, 18, 10, 13};
        arrayEntity.setCurrentArray(currentArray);
        changeArray.changeAllLargeElements(arrayEntity);
        assertEquals(arrayEntity.getCurrentArray(), expected);
    }

    @Test
    public void changeAllEvenElementsTest() {
        int[] currentArray = {2, 3, 5, 18, 10, 5};
        int[] expected = {3, 3, 5, 19, 11, 5};
        arrayEntity.setCurrentArray(currentArray);
        changeArray.changeAllEvenElements(arrayEntity);
        assertEquals(arrayEntity.getCurrentArray(), expected);
    }

    @Test
    public void SortTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int expected = -5;
        arrayEntity.setCurrentArray(currentArray);
        arraySort.arraySort(arrayEntity);
        assertEquals(arrayEntity.getCurrentArray()[0], expected);
    }


}
