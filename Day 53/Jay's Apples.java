/*Examples:

Input: arr[] = [1, 1, 1, 1, 1]
Output: 1
Explanation: The person identified by '1' appears multiple times but will only receive 1 kilogram of apples once. Therefore, the minimum apples required is 1 kg.
Input: arr[] = [1, 2, 3, 1, 2]
Output: 3
Explanation: There are three distinct persons in the queue, so 3 kilograms of apples need to be distributed.*/

class Solution {
    public int minimumApple(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
}
