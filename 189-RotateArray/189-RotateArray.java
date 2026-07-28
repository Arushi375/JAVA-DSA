// Last updated: 7/28/2026, 5:10:37 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int n=nums.length;
        k=k%n;
        int arr[]=new int [n];
        for(i=0;i<n;i++)
        {
            arr[(i+k)%n]=nums[i];
        }
        for(i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}