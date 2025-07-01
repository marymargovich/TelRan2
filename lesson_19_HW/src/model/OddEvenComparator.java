package model;

import java.util.Comparator;

public class OddEvenComparator implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        boolean isO1Even = (o1 % 2 == 0);
        boolean isO2Even = (o2 % 2 == 0);

        if (isO1Even && !isO2Even) {
            return -1;
        } else if (!isO1Even && isO2Even) {
            return 1;
        } else if (isO1Even && isO2Even) {
            return Integer.compare(o1, o2);
        } else {
            return Integer.compare(o2, o1);
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
