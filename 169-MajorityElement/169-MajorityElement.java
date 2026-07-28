// Last updated: 7/28/2026, 5:10:38 PM
class Solution {
    public int majorityElement(int[] nums) {
    int candidate = 0;
    int count = 0;

    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }

        if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }

    return candidate;
}
}