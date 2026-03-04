public class multi {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {2, 4, 8}};
        int[][] matrix2 = {{2, 4, 8}, {5, 8, 9}};
        int[][] sumofMatrix = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumofMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int l = 0; l < 2; l++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(sumofMatrix[l][k]);
            }
            System.out.println();
        }
    }
}



