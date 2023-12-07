public class TwoSumII {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int low = 0;
            int high = numbers.length - 1;
            int curr = numbers[low];
            int[] res = new int[2];

            while (low < high) {
                int temp = numbers[high];
                if (curr + temp == target) {
                    res[0] = low + 1;
                    res[1] = high + 1;
                    return res;
                }
                if (curr + temp > target) {
                    high -= 1;
                }

                if (curr + temp < target) {
                    low += 1;
                    curr = numbers[low];
                }
            }
            return res;
        }
    }
}
