package homework2;

import java.util.Arrays;

public class Task3ArrMultElement {
    public static void main(String[] args) {
        int[] arrNums = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < arrNums.length; i++){
            if(arrNums[i] < 6){
                arrNums[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrNums));
    }
}
