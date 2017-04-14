public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int first = 0;
        int second = 0;
        if(numRows<=0) return result;
        for(int i=0; i<numRows;i++){
            List<Integer>level = new ArrayList<Integer>();
            for(int j=0; j<i+1;j++){
                if(j==0 || j==i){
                    level.add(1);
                }else{
                    first = result.get(i-1).get(j-1);
                    second = result.get(i-1).get(j);
                    level.add(first+second);
                }
            }
                result.add(level);
        }
            return result;
    }
    
}
