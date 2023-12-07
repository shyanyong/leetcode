public class JumpGame {
    static class Solution {
        public static boolean canJump(int[] nums) {
            int reach = 0;
            for (int i = 0; i < nums.length; i++) {
                System.out.println(i);
                System.out.println(reach);
                if (reach < i) {
                    return false;
                }

                reach = Math.max(reach, i + nums[i]);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.canJump(new int[] {3, 2, 1, 0, 4}));
    }
}
