/*Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.*/



class Solution {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
        int left=0, right=n-1;
        Arrays.sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) return true;
            else if(sum<target) left++;
            else{
                right--;
            }
        }
        return false;
    }
}
