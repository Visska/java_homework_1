package homework2;

import java.util.Arrays;

public class Task1ChangeArr {
    public static void main(String[] args) {
        int[] numberArr = {0,1,1,0,0,1,1,1};
        for (int i =0; i < numberArr.length; i++){
            if(numberArr[i] == 0){
                numberArr[i] = 1;
            } else {
                numberArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numberArr));
    }
}