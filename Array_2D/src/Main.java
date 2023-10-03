import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean Search(int[][] matrix, int key){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){
                if (matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+")");
                        return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output:-
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix,5);
    }
}