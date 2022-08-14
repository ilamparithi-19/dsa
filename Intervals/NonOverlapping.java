package Intervals;

import java.util.Arrays;

public class NonOverlapping {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));
            int prevEnd = intervals[0][1];
            int count = 0;
            for(int i = 1; i < intervals.length; i++) {
                if(intervals[i][0] >= prevEnd) {
                    prevEnd = intervals[i][1];
                }
                else {
                    count++;
                    prevEnd = Math.min(intervals[i][1], prevEnd);
                }
            }
            return count;
        }
}
