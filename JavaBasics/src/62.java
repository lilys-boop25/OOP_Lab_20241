import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("how tall are you (m)?");
		Double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs: " + strName + ", " + 
		                   "Age: " + iAge + ", " + "Height: " + dHeight);
	}
}
