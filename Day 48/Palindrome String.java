class Solution {
    boolean isPalindrome(String s) {
        StringBuilder str =new StringBuilder(s);
        if(s.equals(str.reverse().toString())) {
           
            return true;
        }
        
        return false;
        
    }
    
}
