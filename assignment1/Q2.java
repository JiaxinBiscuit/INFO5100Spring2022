import java.util.HashSet;

public class Q2 {
    public boolean isUnique(String s){
        char[] arr = s.toCharArray();
        HashSet hs = new HashSet();
        int i = 0;
        while( i <= arr.length-1){
            if(hs.add(arr[i])){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
