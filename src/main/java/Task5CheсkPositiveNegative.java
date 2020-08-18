import java.util.concurrent.ThreadLocalRandom;

public class Task5CheсkPositiveNegative {
    public static void main(String[] args) {
        int number = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
        System.out.println("Generate number: " + number);
        testPositiveNegative(number);
    }

    private static void testPositiveNegative(int a) {
        if (a >= 0){
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }
}
