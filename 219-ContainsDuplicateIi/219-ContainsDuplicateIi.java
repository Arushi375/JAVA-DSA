// Last updated: 7/28/2026, 5:10:29 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet <Integer> hs=new HashSet <> ();
        if(nums.length==1||nums.length==0){return false;}
        if(k>=nums.length){
            k=nums.length-1;
        }
        int l=0,r=k;
        for(int i=0;i<=k;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else {return true;}
        }
        
        while(r<nums.length-1){
            hs.remove(nums[l]);
            l++;
            r++;
            if(!hs.contains(nums[r])){
                hs.add(nums[r]);
            }
            else {return true;}
        }
        return false;
    }
}