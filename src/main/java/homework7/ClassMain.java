package homework7;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        boolean isCatsFull;
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = {
                new Cat("Murzik", 3),
                new Cat("Markiza", 8),
                new Cat("Kuzia", 11)
        };
        Plate plate = new Plate(20);
        plate.info();
        while (true){
            isCatsFull = true;
            for (Cat cat : cats){
                cat.eat(plate);
                cat.catInfo();
                isCatsFull = isCatsFull && cat.isFull();
            }
            plate.info();
            if(isCatsFull){
                break;
            }
            plate.increaseFood(scanner.nextInt());
        }
    }
}
