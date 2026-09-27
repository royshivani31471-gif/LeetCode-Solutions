class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left=0;
        int maxLen=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){


map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);


            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                   if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++; 
            }

            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    } 
        
            }


        
        
    
