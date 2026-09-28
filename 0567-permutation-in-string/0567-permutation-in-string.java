class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int n=s2.length();
        int[] frequency = new int[26];
        int window=0;
        HashMap<Character, Integer>map=new HashMap<>();
        HashMap<Character, Integer>map2=new HashMap<>();

        for(int i=0; i<s1.length();i++){
      
        map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }
        for(int i=0; i<n;i++){
           window++;     
    
 map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);



    
    

            
            if(window > s1.length()) {

                char remove = s2.charAt(left);

                map2.put(remove, map2.get(remove) - 1);

                if(map2.get(remove) == 0) {
                    map2.remove(remove);
                }

                left++;
                window--;
            }

            
            if(window == s1.length() && map.equals(map2)) {
                return true;
            }
        }

        return false;
    }

        





        }
        





        
    
