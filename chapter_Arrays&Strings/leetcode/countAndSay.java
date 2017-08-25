class Solution {
    public String countAndSay(int n) {
        String str = "1";
        while(--n > 0){
            str = helper(str);
        }
        return str;
    }
    
    public String helper(String str){
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while(pos < str.length()){
            int count = 1;
            while(pos + 1 < str.length() && str.charAt(pos) == str.charAt(pos + 1)){
                count++;
                pos++;
            }
            sb.append(count + "" + str.charAt(pos));
            pos++;
        }
        return sb.toString();
    }
}
