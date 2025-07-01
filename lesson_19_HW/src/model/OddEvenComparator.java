package model;

import java.util.Comparator;

public class OddEvenComparator implements Comparator <Integer> {
    @Override
    public int compare(Integer d1, Integer d2) {
        boolean isEven1 = (d1 % 2 == 0);
        boolean isEven2 = (d2 % 2 == 0);

        if (isEven1 && !isEven2) {
            return -1;
        } else if (!isEven1 && isEven2) {
            return 1;
        } else if (isEven1 && isEven2) {
            return Integer.compare(d1, d2);
        } else {
            return Integer.compare(d2, d1);
        }
    }

    // если тернарниками
    public int compareAlternative(Integer o1, Integer o2){
        return (o1 % 2 == 0 && o2 % 2 != 0) ? -1:
        (o1 % 2 != 0 && o2 % 2 == 0) ? 1:
                (o1 % 2 == 0)? Integer.compare(o1, o2):
                        Integer.compare(o2,o1);
    }

}
