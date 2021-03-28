import com.kozich.arraytask.array.ArrayForTask;
import com.kozich.arraytask.service.ArrayStats;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    @Test
    public void Main() {
        int[] currentArray = {1, 2, 3, 4, 5, 6, 7};
        ArrayForTask arrayForTask = new ArrayForTask(currentArray);
        ArrayStats arrayStats = new ArrayStats();
        assertEquals(arrayStats.getSum(arrayForTask),28);
    }
}
