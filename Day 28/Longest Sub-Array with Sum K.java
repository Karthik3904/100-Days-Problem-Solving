class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        HashMap<Integer, Integer> sum_map = new HashMap<>();
        int current_sum = 0;
        int max_length = 0; 
        for (int i = 0; i < N; i++) {
            current_sum += A[i];
            if (current_sum == K) {
                max_length = i + 1; 
            }
            
            if (sum_map.containsKey(current_sum - K)) {
                int length = i - sum_map.get(current_sum - K);
                max_length = Math.max(max_length, length);
            }
            if (!sum_map.containsKey(current_sum)) {
                sum_map.put(current_sum, i);
            }
        }
        return max_length;
    }
}
