// Last updated: 7/28/2026, 5:11:24 PM
class Solution {
    public int reverse(int x) {
        int r = 0;

        while (x != 0) {

            // overflow check
            if (r > Integer.MAX_VALUE / 10 || 
                r < Integer.MIN_VALUE / 10) {
                return 0;
            }

            r = (r * 10) + (x % 10);
            x = x / 10;
        }

        return r;
    }
}