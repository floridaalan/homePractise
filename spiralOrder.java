class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) return arr;
        
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (up <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                arr.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down; i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return arr;
    }
}
