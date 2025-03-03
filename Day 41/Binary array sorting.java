class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
}
