/*Example1:

Input:
5 6
1 2 3 4 5
2 3 4 5 6 7
Output: 14
Explanation: Common unique elements in both arrays are 2, 3, 4 and 5 so answer will be 2+3+4+5 = 14
Example2:

Input:
5 6
1 2 2 3 5
3 3 2 2 6 5
Output: 10
Explanation: Common unique elements in both arrays are 2, 3 and 5 so answer will be 2+3+5 = 10*/

class Geeks {
public
  static int commonSum(int n1, int n2, int arr1[], int arr2[]) {
            HashSet<Integer>set1=new HashSet<>(); 
            for(int i:arr1) set1.add(i);
            HashSet<Integer>set2=new HashSet<>(); 
            for(int i:arr2) set2.add(i);
            int sum=0;
            int mod=1000000007;
            for(int i:set1){
                if(set2.contains(i))
                 sum =(sum+i)%mod;
            }
            return sum;
  }
}
