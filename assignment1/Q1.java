public class Q1 {

    public boolean isPalindrome(String s){
        char[] arr= s.toCharArray();
        if(arr[0] == arr[arr.length-2] && arr[1] == arr[arr.length-1]){
            return true;
        }
       return false;
    }

}
