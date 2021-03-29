

import com.kozich.arraytask.entity.ArrayEntity;
import com.kozich.arraytask.service.array.impl.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceImplTest {
    @Test
    void getSumTest() {
        int[] currentArray = {1, 2, 3, 4, 5, 6, 7};
        int expected = 28;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getSum(arrayEntity), expected);
    }

    @Test
    void getMiddleValueTest() {
        int[] currentArray = {1, 3, 5, 6};
        double expected = 3.75;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getMiddleValue(arrayEntity), expected);
    }

    @Test
    void getAmountOfElementsTest() {
        int[] currentArray = {-11, 3, 5, 6};
        int expected = 1;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getAmountOfElements(arrayEntity, true), expected);
    }

    @Test
    void findMaxElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 18;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        SearchElementsImpl searchElements = new SearchElementsImpl();
        assertEquals(searchElements.findMaxElement(arrayEntity), expected);
    }

    @Test
    void findMinElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 0;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        SearchElementsImpl searchElements = new SearchElementsImpl();
        assertEquals(searchElements.findMinElement(arrayEntity), expected);
    }

    @Test
    void changeAllPositiveElementsTest() {
        int[] currentArray = {1, 3, 5, 18, 10, -5};
        int[] expected = {-1, -1, -1, -1, -1, -5};
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
//        assertEquals(changeArray.changeAllPositiveElements(arrayEntity), expected);
    }

    @Test
    void changePositionOfFirstElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, -5};
        int[] expected = {3, 5, 18, 10, -5, 1};
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
//        assertEquals(changeArray.changePositionOfFirstElement(arrayEntity), expected);
    }

    @Test
    void changeAllEvenElementsTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int[] expected = {3, 3, 5, 19, 11, -5};
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
//        assertEquals(changeArray.changeAllEvenElements(arrayEntity), expected);
    }

    @Test
    void quickSortTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int expected = -5;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArraySortImpl arraySort = new ArraySortImpl();
        arraySort.quickSort(arrayEntity, 0, currentArray.length - 1);
        assertEquals(arrayEntity.getCurrentArray()[0], expected);
    }

    @Test
    void bubbleSortTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int expected = -5;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArraySortImpl arraySort = new ArraySortImpl();
        arraySort.bubbleSort(arrayEntity);
        assertEquals(arrayEntity.getCurrentArray()[0], expected);
    }

    @Test
    void selectSortTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int expected = -5;
        ArrayEntity arrayEntity = new ArrayEntity(currentArray);
        ArraySortImpl arraySort = new ArraySortImpl();
        arraySort.selectSort(arrayEntity);
        assertEquals(arrayEntity.getCurrentArray()[0], expected);
    }
}
