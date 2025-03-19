/*Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.*/

class Solution {
    void pushZerosToEnd(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            arr[c++]=arr[i];
            
        }
        while(c<arr.length){
            arr[c++]=0;
            
        }
        
        
    }
}
