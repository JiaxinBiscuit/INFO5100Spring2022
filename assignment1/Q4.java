import java.util.Arrays;
import java.util.HashMap;

public class Q4 {
    public boolean isAnagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            if(hashMap1 == null || ! hashMap1.containsKey(arr1[i])){
                hashMap1.put(arr1[i],1);
            } else {
                hashMap1.replace(arr1[i],hashMap1.get(arr1[i])+1);
            }
        }

        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for(int i = 0; i < arr2.length; i++){
            if(hashMap2 == null || ! hashMap2.containsKey(arr1[i])){
                hashMap2.put(arr1[i],1);
            } else {
                hashMap2.replace(arr1[i],hashMap2.get(arr1[i])+1);
            }
        }

        if(hashMap1.size() != hashMap2.size()){
            return false;
        }

        int i = 0;
        while(i<hashMap1.size()){
            if(hashMap1.get(arr1[i]) != hashMap1.get(arr2[i])){
                return  false;
            } else{
                i++;
            }
        }

        return true;
    }

}
