class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        int maxLen=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            while(map.get(s.charAt(i))>1){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);

        }
        return maxLen;

        

        
    }
}