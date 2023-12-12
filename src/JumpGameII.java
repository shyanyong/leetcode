import java.util.LinkedList;

public class JumpGameII {
    static class Solution {
        public static int jump(int[] nums) {

            int len = nums.length;
            int currnode = 0;
            int max = 0;
            int res = 0;

            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(0);

            if (len == 1) {
                return 0;
            }

            while (queue.size() != 0) {
                currnode = queue.poll();
                int jumps = nums[currnode];
                res++;

                if (jumps + currnode >= len - 1) {
                    return res;
                }


                for (int i = 1; i <= jumps; i++) {
                    if (currnode + i > max) {
                        queue.add(currnode + i);
                        max = currnode + i;
                        System.out.println("this is the curr node " + currnode);
                        System.out.println("this is the max " + max);
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.jump(new int[] {1,2,1,1,1}));
    }
}
