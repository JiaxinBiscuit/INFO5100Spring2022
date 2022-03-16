public class Q1 {

    public boolean isPalindrome(String s){
        if(s == null){
            return false;
        }
        if(s.length() == 1){
            return true;
        }

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char chLeft = s.charAt(left);
            char chRight = s.charAt(right);
            if(Character.isLetterOrDigit(chLeft) && Character.isLetterOrDigit(chRight)){
                if(Character.toLowerCase(chLeft) != Character.toLowerCase(chRight)){
                    return true;
            }else{
                    left++;
                    right--;
                }
            }else{
                if(!Character.isLetterOrDigit(chLeft)){
                    left++;
                }
                if(!Character.isLetterOrDigit(chRight)){
                    right--;
                }
            }
        }

       return true;
    }
}
