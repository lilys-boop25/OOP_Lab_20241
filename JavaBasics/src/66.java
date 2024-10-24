import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The number of column of the Matrix: ");
		String column = keyboard.nextLine();
		int n = Integer.parseInt(column);
		System.out.println("The number of row of the Matrix: ");
		String row = keyboard.nextLine();
		int m = Integer.parseInt(row);
		int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        for (int i = 0; i < 2; i++) {
            int[][] matrix = (i == 0) ? matrix1 : matrix2;
            System.out.println("Matrix" + (i + 1) + ":");
            for(int j = 0; j < m; j++) {
            	for(int k = 0; k < n; k++) {
            		matrix[j][k] = keyboard.nextInt();
                	if(k == n - 1) {
                		System.out.print(matrix[j][k] + "\n");
                	} else {
                		System.out.print(matrix[j][k] + " ");
                	}
            	}
            }
        }
}
}
