import java.util.Scanner;
public class ArrayWorks {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a numeric array(separated by spaces): ");
		String input = keyboard.nextLine();
		String[] numbs = input.split(" ");
		int[] arr = new int[numbs.length];
		for(int i = 0; i < numbs.length; i++) {
			arr[i] = Integer.parseInt(numbs[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		int sum = 0;
		for(int num : arr) {
			sum += num;
			System.out.print(num + " ");
		}
		double avg = sum / (arr.length);
		System.out.println("\nTHe sum of the numeric array: " + sum + "\n" 
		                  + "The average value of array elements: " + avg);
	}
}
