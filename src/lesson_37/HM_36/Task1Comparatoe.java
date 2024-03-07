package lesson_37.HM_36;

import java.util.Comparator;

public class Task1Comparatoe implements Comparator<Integer> {


    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = (int1 % 2)==0;
        boolean isSecondEven = (int1 % 2)==0;

        if (isFirstEven && !isSecondEven){
            return -1;
        } else if (!isFirstEven && isSecondEven) {
            return 1;
        }
        else {
            return int1.compareTo(int2);
        }
    }
}
