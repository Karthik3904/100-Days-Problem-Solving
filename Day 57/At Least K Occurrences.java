/*Given an array arr. Return the element that occurs at least k number of times.

Note:

If there are multiple answers, please return the first one.
If there is no element found, return -1.
Examples

Input: arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2
Output: 4
Explanation: Both 7 and 4 occur 2 times. But 4 is first that occurs twice. As the index = 4, is the first element.
Input:  arr[] = [3, 1, 3, 4, 5, 1, 3, 3, 5, 4], k = 3
Output: 3
Explanation: Here, 3 is the only number that appeared atleast 3 times in the array.*/

class Solution {
    public int firstElementKTime(int[] arr, int k) {
          HashMap<Integer,Integer>map= new HashMap<>();
          for(int num:arr){
              map.put(num,map.getOrDefault(num,0)+1);
              if(map.get(num)==k)
              return num;
          }
          return -1;
    }
}
