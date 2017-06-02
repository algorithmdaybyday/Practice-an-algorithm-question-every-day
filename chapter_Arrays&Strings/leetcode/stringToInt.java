public class Solution {
    private static final int maxDiv10 = Integer.MAX_VALUE / 10;
    public int myAtoi(String str) {
	    int i = 0, n = str.length();
	    while(i < n && Character.isWhitespace(str.charAt(i))) i++;
	    int sign = 1;
	    if(i < n && str.charAt(i) == '+'){
		    i++;
	    }else if(i<n && str.charAt(i) == '-'){
		    sign = -1;
		    i++;
	    }
	    int num = 0;
	    while(i < n && Character.isDigit(str.charAt(i))){
		    int digit = Character.getNumbericValue(str.charAt(i));
		    if (num > maxDiv10 || num == maxDiv10 && digit >= 8 ) {
			    return sign == 1 ? Integer.MAX_VALUE:Integer : MIN_VALUE;
		    }
		    num = num * 10 + digit;
		    i++;
 	       
    		} 

	    return sign * num;
}
