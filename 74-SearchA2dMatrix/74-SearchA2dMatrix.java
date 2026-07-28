// Last updated: 7/28/2026, 5:11:02 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int high=m*n-1;
        int k=target;
        while(low<=high){
            int mid=(high+low)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==k){
                return true;
            }
            else if(matrix[row][col]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}