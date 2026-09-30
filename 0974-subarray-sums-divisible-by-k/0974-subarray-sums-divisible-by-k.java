class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(sum,map.getOrDefault(sum,0)+1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int rem=(sum % k+k)%k;
            if(map.containsKey(rem)){
                count=count+map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);

            }
            return count;


        }

        
        
    }
