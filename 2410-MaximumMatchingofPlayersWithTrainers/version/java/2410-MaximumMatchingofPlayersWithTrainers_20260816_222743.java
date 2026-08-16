// Last updated: 8/16/2026, 10:27:43 PM
1class Solution {
2    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
3        int match=0;
4        Arrays.sort(players);
5        Arrays.sort(trainers);
6        int player=0;
7        int trainer=0;
8        while(player<players.length&&trainer<trainers.length){
9            if(players[player]<=trainers[trainer]){
10               match+=1;
11               player++;
12               trainer++; 
13            }
14            else {
15                trainer++;
16            }
17            
18        }
19        return match;
20    }
21}