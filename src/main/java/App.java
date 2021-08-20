import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        int maxLength = getArgument("Max Length:");
        int minSquareValue = getArgument("Min Square Value:");
        System.out.println(NumericalSequence.createArrayOfIntegers(minSquareValue, maxLength));
    }

    public static int getArgument(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}