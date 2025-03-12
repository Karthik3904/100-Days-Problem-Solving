class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String st1=new String(str1);
        String st2=new String(str2);
        if(st1.equals(st2)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
