package numericalSeguence;

import java.util.ArrayList;
import java.util.List;

public class NumericalSequence {
    public NumericalSequence() {
    }
    public static List<Integer> createArrayOfIntegers(int maxLength, int minSquareValue) {
        List<Integer> arrayOfInteger = new ArrayList();
        int startValue = (int) Math.sqrt(minSquareValue);

        for (int i = 0; i < maxLength; i ++) {
            arrayOfInteger.add(startValue + i);

        }
        return arrayOfInteger;
    }}


