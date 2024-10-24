
import java.util.Scanner;
public class stars {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the height of triangle stars: ");
		int n = keyboard.nextInt();
		keyboard.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for(int q = 0; q <= i; q++) {
				System.out.print("*");
			}
			for(int q = i - 1; q > 0; q--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
