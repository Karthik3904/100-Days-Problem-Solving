class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                l.add(arr[i]);
            }
        }
        return l;
    }
}
