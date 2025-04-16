package RevisionForPlacement.Arrays;

public class RotatetheMatrix {
    public static void main(String[] args) {

    }
    static void rotate(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //swap first and last row
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <row/2 ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][row-1-j];
                matrix[i][row-1-j]=temp;
            }
        }
    }
}
