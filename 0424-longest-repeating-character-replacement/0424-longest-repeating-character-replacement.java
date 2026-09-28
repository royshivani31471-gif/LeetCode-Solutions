class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int maxLen=0;
    
        int maxFrequency=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            maxFrequency = Math.max(maxFrequency, map.get(s.charAt(i))
            );
            int windowLength=i-left+1;
            while(windowLength-maxFrequency >k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1
                );
            left++;
            windowLength=i-left+1;

        }



        maxLen=Math.max(maxLen, windowLength);
    }
    return maxLen;

        
    }
}