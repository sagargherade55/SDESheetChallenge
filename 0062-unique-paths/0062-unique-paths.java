class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp= new int [m][n];

        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, m, n, dp);
    }

    public int helper(int row, int col, int m, int n, int [][] dp){
        if(row>=m || col>=n) return 0;
        if(row==m-1 && col==n-1) return 1;

        if(dp[row][col]!=-1) return dp[row][col];

        int right= helper(row+1, col, m, n, dp);
        int down= helper(row, col+1, m, n, dp);

        return dp[row][col]= right+down;
    }
}