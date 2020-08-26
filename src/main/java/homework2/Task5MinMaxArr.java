package homework2;

public class Task5MinMaxArr {
    public static void main(String[] args) {
        int[] arrNums = {7,15,8,4,11};
        int max = arrNums[0];
        int min = max;
        for (int i = 0; i < arrNums.length; i++){
            if (max < arrNums[i]){
                max = arrNums[i];
            }
            if (min > arrNums[i]){
                min = arrNums[i];
            }
        }
        System.out.println("max element array = " + max + " min element array = " + min);
    }
}
