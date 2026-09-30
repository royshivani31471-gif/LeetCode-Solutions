class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;
    long[] prefixSum = new long[n + 1];
         
        
        for(int i=0;i<nums.length;i++){
             prefixSum[i + 1] = prefixSum[i] + nums[i];

        }
        Deque<Integer> deque = new ArrayDeque<>();
         for (int i = 0; i <= n; i++) {

            while (!deque.isEmpty()
                    && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {

                int subarrayLength = i - deque.pollFirst();

                if (subarrayLength < minlen) {
                    minlen = subarrayLength;
                }
            }

            while (!deque.isEmpty()
                    && prefixSum[i] <= prefixSum[deque.peekLast()]) {

                deque.pollLast();
            }

            deque.offerLast(i);
        }

        if (minlen == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minlen;
        }
    }
}
        