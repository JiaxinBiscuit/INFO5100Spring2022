import java.util.HashMap;

public class Q7 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr1 = magazine.toCharArray();
        HashMap<Character,Integer > map1 = new HashMap();
        for(int i = 0; i<arr1.length; i++){
            if(map1 == null || ! map1.containsKey(arr1[i])){
                map1.put(arr1[i],1);
            }else {
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
        }

        char[] arr2 = ransomNote.toCharArray();
        HashMap<Character,Integer > map2 = new HashMap();
        for(int i = 0; i<arr2.length; i++){
            if(map2 == null || ! map2.containsKey(arr2[i])){
                map2.put(arr2[i],1);
            }else{
                map2.put(arr2[i],map2.get(arr2[i])+1);
            }
        }

        for(Character key : map2.keySet()){
            if(!map1.containsKey(key) || map1.get(key) < map2.get(key)){
                return false;
            }
        }

        return true;

    }
}
