// Last updated: 7/28/2026, 5:09:59 PM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<> ();
        int sum=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum%k))
            {
                if(i-hm.get(sum%k)>1)
                {
                    return true;
                }
            }
            else{
                hm.put(sum%k,i);
            }
        }
        return false;
    }

}