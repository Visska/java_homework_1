package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2GameGuessWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Вам нужно угадать одно из слов.");
        System.out.println(String.join(", ", words));
        Random random = new Random();
        while (true){
            int randomIndex = random.nextInt(words.length);
            String guessWord = words[randomIndex];
            checkAnswer(scanner, guessWord);
            System.out.println("Хотите повторить? 0 - нет, 1 - да.");
            // здесь тоже дублирует
            int continueGame = getIntAnswer(scanner);
            if (continueGame <= 0){
                System.out.println("Спасибо за игру!");
                break;
            }
        }
        scanner.close();

    }

    private static void checkAnswer(Scanner scanner, String guessWord) {
        while (true){
            System.out.println("Введите слово");
            String word = scanner.nextLine().toLowerCase();
            if(guessWord.equals(word)){
                System.out.println("Вы угадали!");
                break;
            }
            String[] str = new String[15];
            Arrays.fill(str,"#");
            int minLen = Math.min(word.length(), guessWord.length());
            for(int i = 0; i < minLen; i++){
                if(guessWord.charAt(i) == word.charAt(i)){
                    str[i] = String.valueOf(guessWord.charAt(i));
                }
            }
            System.out.println(String.join("", str));
        }
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
}
