// Last updated: 7/28/2026, 5:09:25 PM
class Solution {
    public int minStartValue(int[] nums) {
        int startvalue=0;
        int sum=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
            if(startvalue>sum)
            {
               startvalue=sum;
            }
        }
        return 1-startvalue;
    }
}