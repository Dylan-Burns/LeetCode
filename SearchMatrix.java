public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target){
                    isFound = true;
                    break;
                }

            }
        }
        return isFound;
    }
}
