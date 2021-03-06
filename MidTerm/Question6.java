public class Question6 {
        public int lengthOfLongestSubstring(String s) {
            int[] chars = new int[128];

            int left = 0;
            int right = 0;

            int res = 0;
            while (right < s.length()) {
                char ch = s.charAt(right);
                chars[ch]++;
                while (chars[ch] > 1) {
                    char l = s.charAt(left);
                    chars[l]--;
                    left++;
                }

                res = Math.max(res, right - left + 1);

                right++;
            }
            return res;
        }
}
