package exercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double kilometersInNM = 1.852;
		final double milesInNM = 1.150779;
		double nauticalMiles;
		double milesOutPut, kmOutPut;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles>>>");
		nauticalMiles = input.nextInt();
		
		milesOutPut = milesInNM * nauticalMiles;
		kmOutPut = kilometersInNM * nauticalMiles;
		
		System.out.println("You have " + milesOutPut + " kmOutPut" + nauticalMiles);
	}

}
