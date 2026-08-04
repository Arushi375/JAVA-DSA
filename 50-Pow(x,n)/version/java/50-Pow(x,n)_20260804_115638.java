// Last updated: 8/4/2026, 11:56:38 AM
1class Solution {
2    public double myPow(double x, int n) {
3        double ans=1.0;
4        long num=n;
5        if(num<0){
6            num=-1*num;
7        }
8        while(num>0){
9            if(num%2==1){
10                ans=ans*x;
11                num=num-1;
12            }
13            else{
14                x=x*x;
15                num=num/2;
16            }
17        }
18        if(n<0) {
19            ans=(1.0)/(double)(ans);
20        }
21        return ans;
22    }
23}