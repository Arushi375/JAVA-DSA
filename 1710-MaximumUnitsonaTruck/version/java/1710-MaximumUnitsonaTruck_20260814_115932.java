// Last updated: 8/14/2026, 11:59:32 AM
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
4        int totalValue=0;
5        for(int[] item:boxTypes){
6            if(item[0]<=truckSize){
7                totalValue+=item[1]*item[0];
8                truckSize-=item[0];
9            }
10            else{
11                totalValue+=item[1]*truckSize;
12                break;
13            }
14        }
15        return totalValue;
16    }
17}