class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        // to check if the first and first column has Zero
        boolean firstRow=false;
        boolean firstCol=false;
        // to check firstRow has zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[0][j]==0){
                    firstRow=true;
                    break;
                }
            }
        }
        //to check firstCol has Zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][0]==0){
                firstCol=true;
                break;
                }
            }
        }
      
        //If not the firstRow/firstCol(use them as flag) move to consecutive col and row 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //make the entire row and col as zero which has firstRow and firstCol with zero 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0||matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
          if(firstRow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}
