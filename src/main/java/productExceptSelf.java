import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);

    }

    public static void productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
            System.out.println("temp" +tmp);

            System.out.println("first loop : " + Arrays.toString(result) + " i = "+i);
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
            System.out.println("temp" +tmp);
            System.out.println("sec loop : " + Arrays.toString(result) + " i = "+i);

        }
//        return result;
    }
}
