public class RotateArray {
    public void rotate(int[] nums, int k) {
        int count = 0;
        int temp = 0;
        int len = nums.length;

        while (count < k) {
            temp = nums[0];
            nums[0] = nums[len - 1];
            for (int i = 1; i < len; i++) {
                int temp2 = nums[i];
                nums[i] = temp;
                temp = temp2;
            }
            count += 1;
        }
    }
}
