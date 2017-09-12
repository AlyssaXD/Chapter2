package exercises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int initials = 3;
		
		int J;
		int M;
		int F;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter initials needed>>>");
		J = input.nextInt();
		
		M = J / initials;
		F = J / initials;
		
		System.out.println("You have " + J + " F" + M);
	}

}
