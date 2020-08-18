import java.util.Calendar;

public class Task8Year {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("This year: " + year);
        int randomYear = (int)(Math.random() * year);
        System.out.println("Random year: " + randomYear);
        testLeapYear(randomYear);
    }

    private static void testLeapYear(int a) {
        if(a % 4 == 0){
            if(a % 100 ==0 && a % 400 != 0){
                System.out.println("Random year is not a leap year!");
            }else {
                System.out.println("Random year is a leap year!");
            }
            System.out.println("Random year is a leap year!");
        }else {
            System.out.println("Random year is not a leap year!");
        }
    }
}
