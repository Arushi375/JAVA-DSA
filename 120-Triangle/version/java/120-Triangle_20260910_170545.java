// Last updated: 9/10/2026, 5:05:45 PM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        // Create an array to store the next row
4        int n=triangle.size();
5        int[] front = new int[n];
6        
7        // Create an array to store the current row
8        int[] cur = new int[n];
9
10        // Initialize front with last row of triangle
11        for (int j = 0; j < n; j++) {
12            front[j] = triangle.get(n - 1).get(j);
13        }
14
15        // Traverse rows from bottom to top
16        for (int i = n - 2; i >= 0; i--) {
17            
18            // Traverse elements in current row
19            for (int j = i; j >= 0; j--) {
20                
21                // Calculate path going down
22                int down = triangle.get(i).get(j) + front[j];
23                
24                // Calculate path going diagonal
25                int diagonal = triangle.get(i).get(j) + front[j + 1];
26                
27                // Store minimum in current row
28                cur[j] = Math.min(down, diagonal);
29            }
30
31            // Update front row with current row
32            front = cur.clone();
33        }
34
35        // Return top element (minimum path sum)
36        return front[0];
37    }
38    }
39