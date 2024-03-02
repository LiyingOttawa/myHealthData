package assign1;

import java.util.Scanner;

public class MyHealthDataTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Data.");
		
		System.out.print("First Name:");
		String firstName = input.next();
		
		System.out.print("Last Name:");
		String lastName = input.next();
		
		System.out.print("Gender:");
		String gender = input.next();
		
		System.out.print("Birth Year:");
		int birthYear = input.nextInt();
		
		System.out.print("Height:");
		double height = input.nextDouble();
		
		System.out.print("Weight:");
		double weight = input.nextDouble();
		
		MyHealthData data = new MyHealthData(firstName, lastName, gender, height,weight, birthYear, 2013);
		
		data.displayMyHealthData();
		System.out.println("Liying Guo, 040858257");
	}

}
