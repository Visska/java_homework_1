package homework5;

import java.util.Random;

public class TestEmployee {
    private static final int NUMBER_EMPLOYEE = 5;
    private  static Random randomAge = new Random();
    private static final int MIN_EMPLOYEE_AGE = 40;


    public static void main(String[] args) {
        Employee[] empArray = new Employee[NUMBER_EMPLOYEE];
        empArray[0] = new Employee(
                "Ivanov Ivan",
                randomAge.nextInt(20)+30,
                "Enginee",
                "ivanovtest@mailbox.com",
                "+7923588344",
                30000);
        empArray[1] = new Employee(
                "Vasiliev Vasiliy",
                randomAge.nextInt(20)+30,
                "Enginee",
                "vasilievtest@mailbox.com",
                "+7923754764",
                30000);
        empArray[2] = new Employee(
                "Valeriev Valeriy",
                randomAge.nextInt(20)+30,
                "Enginee",
                "valerievtest@mailbox.com",
                "+7906345127",
                30000);
        empArray[3] = new Employee(
                "Dmitriev Dmitriy",
                randomAge.nextInt(20)+30,
                "Enginee",
                "dmitrievtest@mailbox.com",
                "+7955106558",
                30000);
        empArray[4] = new Employee(
                "Vaalerieva Valeriya",
                randomAge.nextInt(20)+30,
                "Enginee",
                "valerievatest@mailbox.com",
                "+7906455125",
                30000);

        for(Employee employee: empArray){
            if(employee.getAge() > MIN_EMPLOYEE_AGE){
                employee.printInfo();
            }
        }
    }
}
