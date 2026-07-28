// Last updated: 7/28/2026, 5:11:21 PM
class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int i=0,j=height.length-1;
        int width=0,length=0;
        while(j>i)
        {
           length=Math.min(height[i],height[j]);
            width=j-i;
            area=Math.max(area,length*width);
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
            
        }
        return area;
    }
}