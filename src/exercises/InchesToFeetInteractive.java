package exercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inchesInput;
		
		int feet;
		int inchesLeftOver;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter inches>>>");
		inchesInput = input.nextInt();
		
		feet = inchesInput/12;
		inchesLeftOver = inchesInput % 12;
		
		System.out.println("You have " + feet + " feet " + inchesLeftOver + " inches");
	}

}
