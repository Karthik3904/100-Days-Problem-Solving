/*Examples:

Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
Input: a[] = [1, 2, 4, 3, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3, 4, 5, and 6 are the elements in the intersection of two arrays.*/


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
