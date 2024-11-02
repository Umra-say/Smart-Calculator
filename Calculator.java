package motionCutWork;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter first number: ");
			double num1 = getValidateNum(scanner);
			
			System.out.print("Enter second number: ");
			double num2 = getValidateNum(scanner);
			
			System.out.print("Enter operator (+, -, *, /): ");
			char operator = scanner.next().charAt(0);
			
			double result = calculator(num1, num2, operator);
			
			if(!Double.isNaN(result)) {
				System.out.println("Result: "+result);
			}
			else {
				System.out.println("Error: Division by ZERO(0)");
			}
			
			System.out.print("Do you want to perform another calculation? (yes/no): ");
            if (!scanner.next().equalsIgnoreCase("yes")) {
                break;
            }
		}
	}
	
	private static double getValidateNum(Scanner scanner) {
		while(!scanner.hasNextDouble()) {
			System.out.print("Invalid input. Please enter a number: ");
			scanner.next();
		}
		return scanner.nextDouble();
	}
	
	private static double calculator(double num1, double num2, char operator) {
		switch(operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			if(num2 != 0) {
			return num1 / num2;
		    }
			else {
				return Double.NaN;
			}
		default:
			System.out.println("Invalid Operator");
			return Double.NaN;
		}
	}
}
