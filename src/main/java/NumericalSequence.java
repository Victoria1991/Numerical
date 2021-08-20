import java.util.ArrayList;
import java.util.List;

public class NumericalSequence {
    public NumericalSequence() {
    }

    public static List<Integer> createArrayOfIntegers(int maxLength, int minSquareValue) {
        List<Integer> arrayOfInteger = new ArrayList();
        int startValue = (int)Math.sqrt((double)minSquareValue);

        for(int i = startValue; i <= maxLength; ++i) {
            boolean add = arrayOfInteger.add(i);
        }

        return arrayOfInteger;}}

