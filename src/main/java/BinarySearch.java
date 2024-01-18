public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 66, 77};
        System.out.println(search(arr, 66));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
