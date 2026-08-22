// Last updated: 8/22/2026, 9:52:02 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        List<int[]> ans = new ArrayList<>();
5
6        int i = 0;
7        int n = intervals.length;
8
9        // 1. Intervals completely before newInterval
10        while (i < n && intervals[i][1] < newInterval[0]) {
11            ans.add(intervals[i]);
12            i++;
13        }
14
15        // 2. Merge overlapping intervals
16        while (i < n && intervals[i][0] <= newInterval[1]) {
17            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
18            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
19            i++;
20        }
21
22        // Add the merged interval
23        ans.add(newInterval);
24
25        // 3. Add remaining intervals
26        while (i < n) {
27            ans.add(intervals[i]);
28            i++;
29        }
30
31        return ans.toArray(new int[ans.size()][]);
32    }
33}