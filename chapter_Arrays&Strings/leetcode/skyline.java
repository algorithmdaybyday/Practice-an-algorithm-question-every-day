
class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        Map<Integer, List<int [] >> cps = new TreeMap<>();
        for(int [] b : buildings) {
            cps.putIfAbsent(b[0], new LinkedList<>());
            cps.putIfAbsent(b[1], new LinkedList<>());
            cps.get(b[0]).add(b);
            cps.get(b[1]).add(b);
        }
        
        PriorityQueue<int [] > heap = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int [] b1, int [] b2) {
                return Integer.compare(b2[2], b1[2]);
            }
        });
        
        List<int [] > res = new ArrayList<>();
        for(Map.Entry<Integer, List<int[]>> entry : cps.entrySet()){
            int c = entry.getKey();
            List<int []> bs = entry.getValue();
            
            for(int [] b : bs) {
                if(c == b[0]) {
                    heap.add(b);
                } else {
                    heap.remove(b);
                }
            }
            
            if(heap.isEmpty()) {
                res.add(new int[] {c, 0});
            } else {
                int h = heap.peek()[2];
                if(res.isEmpty() || res.get(res.size() - 1)[1] != h) {
                    res.add(new int [] {c, h});
                }
            }
            
        }
        return res;
    }
}
