class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = -1;
        // search the first column until its betweent he target
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target) return true;
            if (matrix[i][0] > target){
                col = i-1;
                break;
            } 
        }
        if (col == -1) col = matrix.length-1;
        if (col < 0) return false;
        for (int j = 0; j < matrix[col].length; j++) {
            if (matrix[col][j] == target) return true;
        }
        return false;
    }
}
