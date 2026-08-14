// Last updated: 8/14/2026, 1:17:33 PM
1class Solution {
2    public int bagOfTokensScore(int[] tokens, int power) {
3        Arrays.sort(tokens);
4        
5        int left=0;
6        int right=tokens.length-1;
7        int score=0;
8        int max_score=score;
9        
10        while(left<=right){
11            if(power>=tokens[left]){
12                score+=1;
13                power-=tokens[left];
14                left++;
15                max_score=Math.max(max_score,score);
16            } 
17            else if(score>0){ 
18                score-=1;
19                power+=tokens[right];
20                right--;
21            }
22            else{
23                break;
24            }
25        }
26        return max_score;
27    }
28}