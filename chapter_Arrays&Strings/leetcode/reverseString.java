class Solution {
    public String reverseString(String s) {
        int n = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for(int i=n; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
