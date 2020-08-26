package homework2;

import java.util.Arrays;

public class Task2FillArr {
    public static void main(String[] args) {
        int[] numsArr = new int[8];
        for(int i = 0; i < numsArr.length; i++){
            numsArr[i] = i*3;
        }
        System.out.println(Arrays.toString(numsArr));
    }
}
