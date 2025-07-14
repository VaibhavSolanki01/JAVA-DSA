import java.util.Scanner;

public class Matrix {
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0, endRow = 3, startCol = 0, endCol = 3;
        while(startRow <= endRow && startCol <= endCol) {
            //top 
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = matrix.length-1, col = 0;;
        while(row >= 0 && col < matrix[0].length) {
            if(key == matrix[row][col]) {
                System.out.println("key is found at index: " + "(" + row + "," + col + ")");
                return true;
            } else if(key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        // int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        // spiralMatrix(matrix);
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 49, 50}};
        int key = 35;
        staircaseSearch(matrix, key);
    }
}
