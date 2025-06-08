class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;        // rows
        
      
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //swap-->transpose matrix
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // swap between rows and columns
        for (int i=0; i<n; i++) {
            int left=0, right=n-1;
            while (left<right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
        
    
    }
