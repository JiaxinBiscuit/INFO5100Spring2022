import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int slow = 0;
        int max = 0;
        Map<Character, Integer> window = new HashMap();
        for (int fast = 0; fast < s.length(); fast++) {
            char chFast = s.charAt(fast);
            if (!window.containsKey(chFast)) {
                window.put(chFast, fast);
            } else {
                if (slow < window.get(chFast) + 1) {
                    slow = window.get(chFast) + 1;
                }
                window.put(chFast, fast);
            }
            max = Math.max(max, fast - slow + 1);
        }

        return max;
    }
}



