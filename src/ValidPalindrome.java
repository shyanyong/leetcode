public class ValidPalindrome {
    static class Solution {
        public static boolean isPalindrome(String s) {
//            String old = s.toLowerCase();
//            old = old.replaceAll("[^a-zA-Z0-9]", "");
//            System.out.println(old);
//            int left = 0;
//            int right = old.length() - 1;
//
//            while (left < right) {
//                if (old.charAt(left) == old.charAt(right)) {
//                    left++;
//                    right--;
//                } else {
//                    return false;
//                }
//            }
//            return true;
            int low = 0;
            int high = s.length() - 1;

            while (low < high) {
                char left = s.charAt(low);
                if (!isValid(left)) {
                    low++;
                    continue;
                }

                char right = s.charAt(high);
                if (!isValid(right)) {
                    high--;
                    continue;
                }

                left = Character.toLowerCase(left);
                right = Character.toLowerCase(right);
                if (left == right) {
                    low++;
                    high--;
                } else {
                    return false;
                }
            }
            return true;
        }

        public static boolean isValid(char ch) {
            return ((ch >= '0' & ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
