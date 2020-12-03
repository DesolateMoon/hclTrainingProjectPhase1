package calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	public static void main(String[] args) {
		float x, y, result;
		char operation;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Division");
			System.out.println("5: Exit Program\n");
			System.out.print("Enter Your Choice : ");
			operation = scan.next().charAt(0);

			switch (operation) {
				case '1':
					System.out.print("Enter First Number: ");
					x = scan.nextFloat();
					System.out.print("Enter Second Number: ");
					y = scan.nextFloat();
					result = x + y;
					System.out.print("Result = " + result + "\n");
					break;
				case '2':
					System.out.print("Enter First Number: ");
					x = scan.nextFloat();
					System.out.print("Enter Second Number: ");
					y = scan.nextFloat();
					result = x - y;
					System.out.print("Result =" + result + "\n");
					break;
				case '3':
					System.out.print("Enter First Number: ");
					x = scan.nextFloat();
					System.out.print("Enter Second Number: ");
					y = scan.nextFloat();
					result = x * y;
					System.out.println("Result = " + result + "\n");
					break;
				case '4':
					System.out.print("Enter First Number: ");
					x = scan.nextFloat();
					System.out.print("Enter Second Number: ");
					y = scan.nextFloat();
					while (y == 0) {
						System.out.println("Second number cannot be zero!!!");
						System.out.print("Enter Second Number: ");
						y = scan.nextFloat();
					}
					result = x / y;
					System.out.println("Result = " + result + "\n");
					break;
				case '5':
					System.out.println("Program Exiting...");
					scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input, please try again!");
			}

		} while (operation != 5);
		
		System.out.println("Program Exiting...");
		scan.close();
		System.exit(0);
	}
}
