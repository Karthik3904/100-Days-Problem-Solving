/*Examples

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
Output: 5
Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
Input: a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2] 
Output: 7
Explanation: Union set of both the arrays will be 85, 25, 1, 32, 54, 6, and 2. So count is 7.*/

class Solution {
    public static int findUnion(int a[], int b[]) {
        Set<Integer> s=new HashSet<>();
         
         for(int num : a){
             s.add(num);
         }
         for(int num : b){
             s.add(num);
         }
         return s.size();
        
    }
}
