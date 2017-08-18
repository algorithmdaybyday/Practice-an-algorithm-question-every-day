/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        boolean eof = false;
        int total = 0;
        char[] tmp = new char[4];
        
        while(!eof && total < n){
            int count = read4(tmp);
            eof = count < 4;
            count = Math.min(count, n-total);
            for(int i=0; i<count; i++){
                buf[total++] = tmp[i];
            }
        }
        return total;
    }
}
