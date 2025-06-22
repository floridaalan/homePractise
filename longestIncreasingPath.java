class Solution {
    int [][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        int [][] dp;
        int rows,cols;
        public int longestIncreasingPath(int[][] matrix){
            rows = matrix.length;
            cols = matrix[0].length;
            dp = new int[rows][cols];
            int longest = 0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    longest=Math.max(longest,dfs(matrix,i,j));
                }
            }
            return longest;
        }
        private int dfs(int[][] matrix,int i,int j){
            if (dp[i][j] != 0) 
                return dp[i][j];

        int max = 1;

        for (int[] dir : directions) {
            int x=i+dir[0];
            int y=j+dir[1];
            if (x>=0 && x<rows && y>=0 && y<cols &&
                matrix[x][y]>matrix[i][j]) {
                max=Math.max(max,1+dfs(matrix, x, y));
            }
        }
        dp[i][j]=max;
        return max;

        }
        
    }
