package homework1;

public class Task3Calculate {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);
        System.out.println("Generated numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4);
        testCalculator(number1, number2, number3, number4);
    }

    private static void testCalculator(int a, int b, int c, int d) {
        System.out.println("Result = " + (a * (b + (c / d))));
    }
}
