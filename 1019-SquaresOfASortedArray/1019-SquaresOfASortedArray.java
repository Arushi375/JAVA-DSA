// Last updated: 7/28/2026, 5:09:38 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int j=nums.length-1;
        int i=0;
        int n=nums.length;
        for(int p=n-1;p>-1;p-- )
        {
           if(Math.abs(nums[i])>Math.abs(nums[j]))
           {
            arr[p]=nums[i]*nums[i];
            i++;
           }
           else{
            arr[p]=nums[j]*nums[j];
            j--;
           }
        }
        return arr;

    }
}