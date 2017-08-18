public class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null) return "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, 0);
        }
        for(char c : t.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }else{
                return "";
            }
        }
        
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int counter = t.length();
        int minStart = 0;
        
        while(end < s.length()){
            char c1 = s.charAt(end);
            if(hm.get(c1) > 0)
                counter--;
            hm.put(c1, hm.get(c1) - 1);
            end++;
            
            while(counter == 0){
                if(end - start < minLen){
                    minLen = end - start;
                    minStart = start;
                }
                char c2 = s.charAt(start);
                hm.put(c2, hm.get(c2) + 1);
                if(hm.get(c2) > 0)
                    counter++;
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
