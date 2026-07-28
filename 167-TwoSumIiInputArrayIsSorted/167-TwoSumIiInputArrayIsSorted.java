// Last updated: 7/28/2026, 5:10:40 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int arr[]=new int[2];
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            else if(target-numbers[j]>numbers[i])
            {
                i++;
            }
            else if(target-numbers[i]<numbers[j])
            {
                j--;
            }
        }
        return arr;
    }
}