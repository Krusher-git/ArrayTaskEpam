

import com.kozich.arraytask.entity.array.ArrayForTask;
import com.kozich.arraytask.service.array.impl.ArrayStatsImpl;
import com.kozich.arraytask.service.array.impl.ChangeArrayImpl;
import com.kozich.arraytask.service.array.impl.SearchElementsImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceImplTest {
    @Test
    void getSumTest() {
        int[] currentArray = {1, 2, 3, 4, 5, 6, 7};
        int expected = 28;
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getSum(arrayForTask), expected);
    }

    @Test
    void getMiddleValueTest() {
        int[] currentArray = {1, 3, 5, 6};
        double expected = 3.75;
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getMiddleValue(arrayForTask), expected);
    }

    @Test
    void getAmountOfElementsTest() {
        int[] currentArray = {-11, 3, 5, 6};
        int expected = 1;
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ArrayStatsImpl arrayStats = new ArrayStatsImpl();
        assertEquals(arrayStats.getAmountOfElements(arrayForTask, true), expected);
    }

    @Test
    void findMaxElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 18;
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        SearchElementsImpl searchElements = new SearchElementsImpl();
        assertEquals(searchElements.findMaxElement(arrayForTask), expected);
    }

    @Test
    void findMinElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, 0};
        int expected = 0;
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        SearchElementsImpl searchElements = new SearchElementsImpl();
        assertEquals(searchElements.findMinElement(arrayForTask), expected);
    }

    @Test
    void changeAllPositiveElementsTest() {
        int[] currentArray = {1, 3, 5, 18, 10, -5};
        int[] expected = {-1, -1, -1, -1, -1, -5};
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
        assertEquals(changeArray.changeAllPositiveElements(arrayForTask), expected);
    }

    @Test
    void changePositionOfFirstElementTest() {
        int[] currentArray = {1, 3, 5, 18, 10, -5};
        int[] expected = {3, 5, 18, 10, -5, 1};
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
        assertEquals(changeArray.changePositionOfFirstElement(arrayForTask), expected);
    }

    @Test
    void changeAllEvenElementsTest() {
        int[] currentArray = {2, 3, 5, 18, 10, -5};
        int[] expected = {3, 3, 5, 19, 11, -5};
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ChangeArrayImpl changeArray = new ChangeArrayImpl();
        assertEquals(changeArray.changeAllEvenElements(arrayForTask), expected);
    }
}
