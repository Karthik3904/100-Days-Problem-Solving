class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> factorialList = new ArrayList();
        long index = 1;
        long factorial = 1;
        while (n >= factorial) {
            factorialList.add(factorial);
            index++;
            factorial *= index;
        }
    
        return factorialList;
    }
}
