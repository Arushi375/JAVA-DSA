// Last updated: 11/27/2026, 10:22:59 AM
1
2class Solution {
3    public int maxEnvelopes(int[][] envelopes) {
4        if (envelopes.length == 0) {
5            return 0;
6        }
7
8        // Sort width ascending, and height descending for equal widths
9        Arrays.sort(envelopes, (a, b) -> {
10            if (a[0] == b[0]) {
11                return b[1] - a[1];
12            }
13            return a[0] - b[0];
14        });
15
16        // Store the smallest possible ending height
17        ArrayList<Integer> temp = new ArrayList<>();
18
19        for (int i = 0; i < envelopes.length; i++) {
20
21            int height = envelopes[i][1];
22
23            // If height is greater than all elements, extend LIS
24            if (temp.size() == 0 || height > temp.get(temp.size() - 1)) {
25                temp.add(height);
26            } 
27            else {
28                // Find lower bound: first element >= height
29                int low = 0;
30                int high = temp.size() - 1;
31
32                while (low <= high) {
33                    int mid = low + (high - low) / 2;
34
35                    if (temp.get(mid) >= height) {
36                        high = mid - 1;
37                    } 
38                    else {
39                        low = mid + 1;
40                    }
41                }
42
43                temp.set(low, height);
44            }
45        }
46
47        return temp.size();
48    }
49}
50