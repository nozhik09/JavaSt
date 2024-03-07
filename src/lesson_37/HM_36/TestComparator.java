package lesson_37.HM_36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestComparator {

    Integer[] arrays;

    @BeforeEach
    void setUp() {

        arrays = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(arrays,new Task1Comparatoe());
        Assertions.assertEquals(new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9} , arrays);
    }

    @Test
    void testComparator(){
        Arrays.sort(arrays,new Task1Comparatoe());
        Assertions.assertEquals(new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9} , arrays);

    }


}
