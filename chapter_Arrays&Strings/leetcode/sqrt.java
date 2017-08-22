class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        
        int left = 1;
        int right = x;
        
        while(true){
            int mid = (right -left) / 2 + left;
            if(mid > x/mid) {
                right = mid;
            }else{
                if(mid + 1 > x/(mid+ 1)) 
                    return mid;
                left = mid;
            }
        
        }
    }
}
