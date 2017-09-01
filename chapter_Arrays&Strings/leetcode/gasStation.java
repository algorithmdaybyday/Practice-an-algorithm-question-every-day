class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int sumGas = 0;
        int sumCost = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            sumGas += gas[i];
            sumCost += cost[i];
            tank += gas[i] - cost[i];
            if(tank < 0){
                tank = 0;
                start = i+1;
            }
        }
        if(sumGas < sumCost){
            return -1;
        }else{
            return start;
        }
        
    }
}
