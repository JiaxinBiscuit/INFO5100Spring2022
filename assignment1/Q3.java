import java.util.HashSet;

public class Q3 {
    public boolean isDuplicate(String s) {
        char[] arr = s.toCharArray();
        HashSet hs = new HashSet();
        int i = 0;
        while (i <= arr.length - 1) {
            if (hs.add(arr[i])) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}

