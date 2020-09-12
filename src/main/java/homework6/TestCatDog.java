package homework6;

import java.util.Random;

public class TestCatDog {
    private static final int LIMIT_RUN = 600;
    private  static final double MAX_LIMIT_JUMP = 2.0;
    private static final double MIN_LIMIT_JUMP = 0.5;
    private static final int LIMIT_SWIM = 15;
    private static Random random = new Random();
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.run(getRandomInt(LIMIT_RUN));
        dog1.swim(getRandomInt(LIMIT_SWIM));
        dog1.jump(getRandomDouble(MAX_LIMIT_JUMP, MIN_LIMIT_JUMP));

        Cat cat1 = new Cat();
        cat1.run(getRandomInt(LIMIT_RUN));
        cat1.swim(getRandomInt(LIMIT_SWIM));
        cat1.jump(getRandomDouble(MAX_LIMIT_JUMP, MIN_LIMIT_JUMP));
    }


    private static int getRandomInt(int max) {
        return  random.nextInt(max +1);
    }

    private static double getRandomDouble(double max, double min) {
        return  min + (max - min) * random.nextDouble();
    }
}
