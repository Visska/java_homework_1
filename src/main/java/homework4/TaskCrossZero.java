package homework4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TaskCrossZero {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    private static  final Scanner scanner = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();


        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интелект!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
            int xNumber = -1, yNumber = -1;
            do {
                System.out.println("Введите координаты в формате: номер строки номер колонки");
                try {
                    xNumber = scanner.nextInt() - 1;
                    yNumber = scanner.nextInt() - 1;
                } catch (InputMismatchException e) {
                    System.out.println("Введено неверное значение!");
                    scanner.nextLine();
                }
            } while (isCellValid(xNumber, yNumber));
            map[yNumber][xNumber] = DOT_X;
    }

    private static boolean isCellValid(int xNumber, int yNumber) {
        if (xNumber < 0 || xNumber >= SIZE || yNumber < 0 || yNumber >= SIZE)
            return true;
        return map[yNumber][xNumber] != DOT_EMPTY;
    }

    private static void aiTurn() {
        int xIndex, yIndex;
        do {
            xIndex = rand.nextInt(SIZE);
            yIndex = rand.nextInt(SIZE);
        } while (isCellValid(xIndex, yIndex));
        map[yIndex][xIndex] = DOT_O;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        return checkDiagonal1(symbol) || checkDiagonal2(symbol) || checkCols(symbol) || checkRows(symbol);
    }

    private static boolean checkDiagonal1(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != symbol)
                return false;
        }
        return true;
    }

    private static boolean checkDiagonal2(char symbol) {
        int lastIndex = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {
            if (map[lastIndex][lastIndex] != symbol)
                return false;
        }
        return true;
    }

    private static boolean checkCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != symbol)
                    return false;
            }
        }
        return true;
    }

    private static boolean checkRows(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] != symbol)
                    return false;
            }
        }
        return true;
    }
}
