package Homework.Ait.HW30.Test;

import Homework.Ait.HW30.Model.ArrayTools;
import Homework.Ait.HW30.Model.OddEvenComparator1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Homework.Ait.HW30.Model.OddEvenComparator;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSortArray {
    OddEvenComparator oddEvenComparator;
    OddEvenComparator1 oddEvenComparator1;
    Integer[] origin;
    Integer[] expected;
    Integer[] expected1;

    @BeforeEach
    void setUp(){
        origin = new Integer[]{ 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
        expected = new Integer[]{ 4, 2, 6, 8, 1, 3, 5, 9, 7, 3 };
        expected1 = new Integer[]{ 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
    }

    @Test
    void testSortArrayEasily(){
        oddEvenComparator = new OddEvenComparator();
        Arrays.sort(origin, oddEvenComparator);
//        ArrayTools.printArray(origin);
//        ArrayTools.printArray(expected);
        assertArrayEquals(origin, expected);
    }

    @Test
    void testSortArrayDifficult(){
        oddEvenComparator1 = new OddEvenComparator1();
        Arrays.sort(origin, oddEvenComparator1);
//        ArrayTools.printArray(origin);
//        ArrayTools.printArray(expected1);
        assertArrayEquals(origin, expected1);
    }
}
