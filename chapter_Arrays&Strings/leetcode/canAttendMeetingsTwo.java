/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length]; 
        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        int room = 0;
        int endIntr = 0;
        for(int i=0; i<intervals.length; i++){
            if(start[i] < end[endIntr]){
                room++;
            }else{
                endIntr++;
            }
        }
        return room;
    }
}
