class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
                if(sum>target){
                    break;
                }
            }
            
        }
        list.add(-1);
        return list;
        
    }
}
