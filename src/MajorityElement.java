public class MajorityElement {
    // class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 1;
//         int num = nums[0];
//         int i = 1;

//         // for (int i = 1; i < nums.length; i++) {
//         while (i < nums.length) {
//             if (count <= 0) {
//                 num = nums[i];
//             }

//             if (nums[i] == num) {
//                 count += 1;
//             } else {
//                 count -= 1;
//             }


//             i++;
//         }

//         return num;
//     }
// }

    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int num = 0;

            for (int i = 0; i < nums.length; i++) {
                if (count <= 0) {
                    num = nums[i];
                }

                if (nums[i] == num) {
                    ++count;
                } else {
                    --count;
                }


            }

            return num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1,1,4,1,1,5,1,1,6,2,2};
    }
}
