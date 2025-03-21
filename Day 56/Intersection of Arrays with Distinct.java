class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        int count=0;
        for(int num : a){
            set1.add(num);
        }
        for(int num : b){
            set2.add(num);
        }
        for(int num : set1){
            if(set2.contains(num))
             count++;
        }
        return count;
        
    }
}
