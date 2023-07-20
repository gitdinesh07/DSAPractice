package DS.Array;

public class Matrix {
    
    public static void main(String[] args) {
        
        var matrix = new int[3][3];
        matrix[0]= new int[] {1,2,3};
        matrix[1]= new int[] {4,5,6};
        matrix[2]= new int[] {7,8,9};


        var transposeMatrix =  TransposeMatrix(matrix);
    }

    private static int[][] TransposeMatrix(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] returnArray =new int[cols][rows];
        
        for(int r =0; r < rows;r++)
        {
            for(int c=0; c < cols; c++)
            {
                returnArray[c][r] = matrix[r][c];
            }
        }
        return returnArray;
    }
}
