// Last updated: 8/19/2026, 9:37:37 AM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int n5=0;
4        int n10=0;
5        for(int i=0;i<bills.length;i++){
6            if(bills[i]==5){
7                n5+=1;
8            }
9            else if(bills[i]==10){
10                if(n5>=1){
11                    n5-=1;
12                    n10+=1;
13                }
14                else{
15                    return false;
16                }
17            }
18            else{
19                if(n5>=1&&n10>=1){
20                    n5-=1;
21                    n10-=1;
22                }
23                else if(n5>=3){
24                    n5-=3;
25                }
26                else{
27                    return false;
28                }
29            }
30        }
31        return true;
32    }
33}