/*Example 1:

Input:
N = 5
arr[] = {2, 3, 4, 5, 1}
Output: 
-1 2 3 4 -1
Explanation:
Greatest element on the left of 3 smaller 
than itself is 2, for 4 it is 3 and for 5 
it is 1. Since 2 is the first element and 
no element on its left is present, so it's 
greatest smaller element will be -1 and for 
1 no element smaller than itself is present 
on its left, so it's greatest smaller element 
is -1.*/

class Complete {

    // Function for finding maximum and value pair
    public static int[] Smallestonleft(int arr[], int n) {
        int[] res= new int[n];
        TreeSet<Integer> set=new TreeSet<>();
        res[0]=-1;
        set.add(arr[0]);
        for(int i=1;i<n;i++){
            Integer small=set.lower(arr[i]);
            res[i]=(small!=null)? small: -1;
            set.add(arr[i]);
        }
        return res;
    }
}
