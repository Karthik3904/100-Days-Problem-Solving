/*Given a string s without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.

Note: The original order of characters must be kept the same. 

Examples :

Input: s = "zvvo"
Output: "zvo"
Explanation: Only keep the first occurrence
Input: s = "gfg"
Output: "gf"
Explanation: Only keep the first occurrence*/

class Solution {
    String removeDups(String s) {
        HashSet<Character>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(set.add(s.charAt(i)))
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
