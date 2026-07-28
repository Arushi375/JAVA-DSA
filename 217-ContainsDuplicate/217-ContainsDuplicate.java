// Last updated: 7/28/2026, 5:10:31 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hm=new HashSet<Integer> ();
        boolean hasDuplicate=false;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(hm.contains(nums[i])){
                hasDuplicate=true;
                break;
            }
            else{
                hm.add(nums[i]);
            }
        }
        return hasDuplicate;
    }
    
}