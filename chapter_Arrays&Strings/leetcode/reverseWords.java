public class Solution {
    public String reverseWords(String s) {
        StringBuilder reverseString = new StringBuilder();
        int j = s.length();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                j=i;
            }else if(i==0||s.charAt(i-1)==' '){
                if(reverseString.length()!=0){
                 reverseString.append(' ');   
                }
                reverseString.append(s.substring(i,j));

            }
        }
        return reverseString.toString();
    }
}
