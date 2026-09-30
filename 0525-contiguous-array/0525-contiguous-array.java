class Solution {
    public int findMaxLength(int[] nums) {
        int count=0;
        int n=nums.length;
          int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count--;
               } else{
                    count++;
               }
                    if(map.containsKey(count)){
                        int len=i-map.get(count);
                          maxLen = Math.max(maxLen, len);
            } else {
                map.put(count, i);
            }
        }

        return maxLen;
    }
}

