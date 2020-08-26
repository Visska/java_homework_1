package homework2;

public class Task6BalanceArray {
    public static void main(String[] args) {
        int[] numsArr = {9,2,2,5,3,5};
        System.out.println(checkBalance(numsArr));
    }

    private static boolean checkBalance(int[] nums) {
        int sumLeft = 0;
        for(int i = 0; i < nums.length; i++){
            sumLeft += nums[i];
            int sumRight = 0;
            for(int j = i+1; j < nums.length; j++){
                sumRight += nums[j];
            }
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }
}
