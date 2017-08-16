public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        if(s==null) return res;
        
        queue.add(s);
        visited.add(s);
        boolean found = false;
        
        while(!queue.isEmpty()){
            s = queue.poll();
            if(isValid(s)){
                res.add(s);
                found = true;
            }
            
            if(found) continue;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='(' && s.charAt(i)!=')') continue;
                String t = s.substring(0, i) + s.substring(i+1);
                if(!visited.contains(t)){
                    visited.add(t);
                    queue.add(t);
                }
            }
        }
        return res;
    }
    public boolean isValid(String s) {
      int count = 0;
    
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '(') count++;
        if (c == ')' && count-- == 0) return false;
      }
    
      return count == 0;
    }
}
