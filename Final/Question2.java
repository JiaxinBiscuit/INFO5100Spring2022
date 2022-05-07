public class Question2 {
    public String compressString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        int slow = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int fast = 1; fast < str.length(); fast++) {
            if (fast == str.length() || str.charAt(fast) != str.charAt(fast - 1)) {
                sb.append(str.charAt(slow));
                slow = fast;
                if (count > 1) {
                    String s = String.valueOf(count);
                    for (int i = 0; i < s.length(); i++) {
                        sb.append(s.charAt(i));
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }

        if (str.length() <= sb.length()) {
            return str;
        }

        return sb.toString();
    }
}