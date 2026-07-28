// Last updated: 7/28/2026, 5:11:26 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int arr[]=new int[l1+l2];
        int k=0;
        int i=0,j=0;
        while(i<l1&&j<l2){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<l1){
            arr[k++]=nums1[i++];
        }
        while(j<l2){
            arr[k++]=nums2[j++];
        }
        if(arr.length%2==1){
            return arr[arr.length/2];
        }
        return (arr[arr.length/2]+arr[arr.length/2-1])*1.0/2;

    }
}