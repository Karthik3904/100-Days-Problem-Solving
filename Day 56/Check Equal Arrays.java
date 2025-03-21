/*Examples:

Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.*/


class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
         Arrays.sort(a);
         Arrays.sort(b);
         for(int i=0;i<a.length;i++){
             if(a[i]!=b[i]){
                 return false;
             }
         }
         return true;
    }
}
