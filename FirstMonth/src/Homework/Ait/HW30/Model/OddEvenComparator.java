package Homework.Ait.HW30.Model;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer t1, Integer t2) {
        if(isEven(t1) && !isEven(t2)) {
            return -1;
        } else if (isEven(t1) && isEven(t2)) {
            return 0;
        } else if (!isEven(t1) && isEven(t2)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isEven(Integer t1){
        return t1 % 2 == 0;
    }
}
