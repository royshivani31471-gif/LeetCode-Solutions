class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> map=new HashMap<>();
    int count=0;
    int sum=0;
    int n=nums.length;
    map.put(sum,map.getOrDefault(sum,0)+1);
    
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
       int  previousSum=sum-k;
    if (map.containsKey(previousSum)) {
                count = count + map.get(previousSum);
            }

            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    }
    


        
    
