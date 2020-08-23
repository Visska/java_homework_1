package homework1;

import java.util.concurrent.ThreadLocalRandom;

public class Task6CheckTrue {
    public static void main(String[] args) {
        int number = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
        System.out.println("Generate number: " + number);
        testNegative(number);
    }

    private static void testNegative(int a) {
        if (a < 0) {
            System.out.println(true);
        }
    }
}
