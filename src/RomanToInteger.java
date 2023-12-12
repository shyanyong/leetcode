import java.util.HashMap;

public class RomanToInteger {
        static class Solution {
            public static int romanToInt(String s) {
                int length = s.length();
                int res = 0;
                int val = 0;
                HashMap<Character, Integer> values = new HashMap<>();
                values.put('I', 1);
                values.put('V', 5);
                values.put('X', 10);
                values.put('L', 50);
                values.put('C', 100);
                values.put('D', 500);
                values.put('M', 1000);

                for (int i = length - 1; i >= 0; i--) {
                    char curr = s.charAt(i);
                    int next = values.get(curr);
                    if (next < val) {
                        res -= next;
                    } else {
                        res += next;
                    }
                    val = next;
                }

                return res;
            }
    }

    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("MCMXCIV"));
    }
}
