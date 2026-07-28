// Last updated: 7/28/2026, 5:11:09 PM
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            int k=matrix.length-1;
            for(int j=0;j<n;j++)
            {
                arr[i][j]=matrix[k][i];
                k--;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=arr[i][j];
            }
        }
    }
}