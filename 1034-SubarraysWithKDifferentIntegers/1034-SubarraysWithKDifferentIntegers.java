// Last updated: 7/28/2026, 5:09:35 PM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findMax(nums,k)-findMax(nums,k-1);
    }
    private int findMax(int[] nums, int k){
        HashMap <Integer,Integer> freq=new HashMap<> ();
        int l=0,r=0;
        int count=0;
        while(r<nums.length){
            freq.put(nums[r],freq.getOrDefault(nums[r],0)+1);
            while(freq.size()>k){
                freq.put(nums[l],freq.get(nums[l])-1);
                if(freq.get(nums[l])==0){
                    freq.remove(nums[l]);
                }
                l++;
            }
            if(freq.size()<=k){
                count+=(r-l+1);
            }
            r++;
        }
        return count;
    }
}