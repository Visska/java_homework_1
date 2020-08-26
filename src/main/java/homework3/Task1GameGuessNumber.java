package homework3;

import java.util.Random;
import java.util.Scanner;

public class Task1GameGuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountNums = 9;
        System.out.println("Вам нужно угадать число за 3 попытки.");
        Random random = new Random();
        int step = 3;
        while (true){
            int guessNumber = random.nextInt(amountNums + 1);
            checkAnswer(step, amountNums, guessNumber, scanner);
            System.out.println("Хотите повторить? 0 - нет, 1 - да.");
            // Почему-то два раза сообщает об ошибке ввода
            int continueGame = getIntAnswer(scanner);
            if (continueGame <= 0){
                System.out.println("Спасибо за игру!");
                break;
            }
        }
        scanner.close();

    }

    private static int getIntAnswer(Scanner scanner) {
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("Было введено нечисловое значение.");
                scanner.nextLine();
                continue;
            }
            return scanner.nextInt();
        }
    }

    private static void checkAnswer(int step,int amountNums,int guessNumber,Scanner scanner) {
        while (true){
            if(step <= 0){
                System.out.println("Вы не угадали! Правильный ответ: " + guessNumber);
                break;
            }
            System.out.println("Введите число от 0 до " + amountNums);
            int number = getIntAnswer(scanner);
            if(number == guessNumber){
                System.out.println("Поздравляю! Вы угадали!");
                break;
            }else if(number < guessNumber){
                System.out.println("Загаданное число больше.");
            }else {
                System.out.println("Загаданное число меньше.");
            }
            step--;
        }
    }
}
