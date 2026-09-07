class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int left=0;
        int sum=0;
        int n=nums.length;
          double maxAverage = Double.NEGATIVE_INFINITY;
         for( int i=0;i<n;i++){

            sum=sum+nums[i];

            if(i-left+1==k){

              double  average=(double)sum/k;
                if(average>maxAverage){
                  maxAverage=average;
                }
                 sum = sum - nums[left];
                left++;
            }
        }

        return maxAverage;
    }
}
               