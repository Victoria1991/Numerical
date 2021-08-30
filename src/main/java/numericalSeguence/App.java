package numericalSeguence;

import java.util.List;
import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        int maxLength = getArgument("Max Length:");
        int minSquareValue = getArgument("Min Square Value:");

        boolean isCorrect = false;
        do {
            if (maxLength <= 0 || minSquareValue <= 0) {
                System.out.println("You entered an invalid value");
                maxLength = getArgument("Max Length:");
                minSquareValue = getArgument("Min Square Value:");
            } else {
                printNumericalSquence(maxLength, minSquareValue);
                isCorrect = true;
            }
        }
        while (!isCorrect);
    }

    private static void printNumericalSquence(int maxLength, int minSquareValue) {
        List<Integer> arrayOfInteger = NumericalSequence.createArrayOfIntegers(maxLength, minSquareValue);
        for (int s : arrayOfInteger) {
            System.out.println(s);
        }
    }

    public static int getArgument (String message){
            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            return sc.nextInt();
        }
    }