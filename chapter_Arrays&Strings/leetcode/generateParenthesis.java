
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        if(n==0) return result;
        backtracking(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    public void backtracking(List<String> result, StringBuilder sb, int open, int close, int n){
        if(open == n && close == n){
            result.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append("(");
            backtracking(result, sb, open + 1, close, n);
            sb.setLength(sb.length() - 1);            
        }
        
        if(close < open){
            sb.append(")");
            backtracking(result, sb, open, close + 1, n);
            sb.setLength(sb.length() - 1);
        }
    }
}
