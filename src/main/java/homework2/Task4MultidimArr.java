package homework2;

import java.util.Arrays;

public class Task4MultidimArr {
    public static void main(String[] args) {
        int squareLen = 6;
        int[][] numsArray = new int[squareLen][squareLen];
        int lastIndex = numsArray.length - 1;
        for(int i = 0; i < numsArray.length; i++){
            numsArray[i][i] = 1;
            numsArray[lastIndex - i][i] = 1;
        }
        for (int[] item : numsArray) {
            System.out.println(Arrays.toString(item));
        }
    }
}
