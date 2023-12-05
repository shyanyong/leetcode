import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int ptr1 = 0;
            int arraylength = nums.length;
            int ptr2 = 0;
            int ctr = 0;

            while (ptr2 < arraylength) {
                if (ptr2 + 1 < arraylength && nums[ptr2] == nums[ptr2 + 1] && ctr < 1) {
                    nums[ptr1] = nums[ptr2];
                    ctr += 1;
                    ptr2++;
                    ptr1++;
                } else if (ptr2 + 1 < arraylength && nums[ptr2] == nums[ptr2 + 1]) {
                    ptr2++;
                } else {
                    nums[ptr1] = nums[ptr2];
                    ptr1++;
                    ptr2++;
                    ctr = 0;
                }
            }

            return ptr1;
        }
    }
}
