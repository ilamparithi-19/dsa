class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N ; i++) {
            for (int j = i ; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int k = 0 ; k < N ; k ++) {
            for (int l = 0; l < (N/2); l++) {
                matrix[k][l] ^= matrix[k][N-l-1];
                matrix[k][N-l-1] ^= matrix[k][l];
                 matrix[k][l] ^= matrix[k][N-l-1];
            }
        }
    }
}
