import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }

        if(s.length() == 0 && t.length() == 0){
            return true;
        }

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        for(int i = 0; i<t.length(); i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }else{
                if(map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i), map.get(t.charAt(i))-1);
                }
            }
        }

        return map.isEmpty()? true: false;

    }
}
