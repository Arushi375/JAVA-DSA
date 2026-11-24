// Last updated: 11/24/2026, 10:27:05 PM
1class Solution {
2    public int bestTeamScore(int[] scores, int[] ages) {
3int n = ages.length;
4int[][] players = new int[n][2];
5
6for (int i = 0; i < n; i++) {
7    players[i][0] = ages[i];
8    players[i][1] = scores[i];
9}
10
11Arrays.sort(players, (a, b) -> {
12    if (a[0] != b[0])
13        return a[0] - b[0];
14    return a[1] - b[1];
15});
16
17int[] sortedScores = new int[n];
18
19for (int i = 0; i < n; i++) {
20    sortedScores[i] = players[i][1];
21}
22int max=0;
23int []dp=new int[n];
24for(int i=0;i<n;i++){
25    dp[i]=sortedScores[i];
26}
27for(int index=0;index<n;index++){
28    for(int prev=0;prev<index;prev++){
29        if(sortedScores[prev]<=sortedScores[index]){
30            dp[index]=Math.max(dp[index],sortedScores[index]+dp[prev]);
31            
32        }
33    }
34    max=Math.max(max,dp[index]);
35}
36return max;
37    }
38}