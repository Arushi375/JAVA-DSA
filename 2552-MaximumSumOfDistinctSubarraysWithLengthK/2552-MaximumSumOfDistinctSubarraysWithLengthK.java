// Last updated: 7/28/2026, 5:09:07 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=k;
        long sum=0,maxSum=0;
        HashMap <Integer,Integer> hm = new HashMap <>();
        int duplicates=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])==2){
                duplicates++;
            }
        }
        if(duplicates==0){
            maxSum=sum;
        }
        while(r<nums.length){
            if(hm.get(nums[l])==2){
                duplicates--;
            }
            hm.put(nums[l],hm.get(nums[l])-1);

            if(hm.get(nums[l])==0){
                hm.remove(nums[l]);
            }
            sum-=nums[l];
            l++;
            
            sum+=nums[r];
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            if(hm.get(nums[r])==2){
                duplicates++;
            }
            if(duplicates==0){
                maxSum=Math.max(maxSum,sum);
            }
            r++;
        }
        return maxSum;
    }
}