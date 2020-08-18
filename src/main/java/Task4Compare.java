public class Task4Compare {
    public static void main(String[] args) {
        int numberA = (int)(Math.random() * 30);
        int numberB = (int)(Math.random() * 30);
        System.out.println("Random number: " + numberA + " and " + numberB);
        testCompare(numberA, numberB);
    }

    private static void testCompare(int a, int b) {
        if (10 >=(a + b) || (a + b)<= 20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
