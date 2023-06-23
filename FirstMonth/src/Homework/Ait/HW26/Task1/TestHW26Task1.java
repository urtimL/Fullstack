package Homework.Ait.HW26.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHW26Task1 {
    HW26Task1 testKlass;

    @BeforeEach
    void setUp() {
        testKlass = new HW26Task1();
    }

    @Test
    void testRepeatingNumbers1(){
        int[] arrBase = {0, 1, 2, 0, 1, 2, 3, 4, 5};
        int[] arrRepits = {0, 1, 2};
        assertArrayEquals(arrRepits, HW26Task1.repeatingNumbers(arrBase));
    }

    @Test
    void testRepeatingNumbers2(){
        int[] arrBase = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrRepits = {};
        assertArrayEquals(arrRepits, HW26Task1.repeatingNumbers(arrBase));
    }
}
