public class IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int s1 = 0;
            int t1 = 0;

            if (s.length() < 1) {
                return true;
            }

            if (t.length() < 1) {
                return false;
            }

            while (t1 < t.length()) {
                if (s1 == s.length()) {
                    return true;
                }

                if (s.charAt(s1) == t.charAt(t1)) {
                    s1++;
                    t1++;
                } else {
                    t1++;
                }
            }

            return s1 == s.length();
        }
    }
}
