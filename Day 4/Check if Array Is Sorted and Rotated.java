class Solution {
    public boolean check(int[] nums) {
        int[] arr = new int[nums.length];
        for(int x = 0 ; x<nums.length ; x++){
            for(int i = 0 ; i<nums.length ; i++){
                arr[i] = nums[(i+x) % nums.length];
            }
            if(checkSorted(arr)){
                return true;
            }
        }
        return false;  
    }
    boolean checkSorted(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
