package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String wordEst;
		String bodyPartPlural;
		String anAnimal, aNoun, PluralNoun;
		
		int a, b, c;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print("Enter a wordEst >>");
		wordEst = input.nextLine();
		System.out.print("Enter a bodyPartPlural >>");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter anAnimal >>");
		anAnimal = input.nextLine();
		System.out.print("Enter aNoun >>");
		aNoun = input.nextLine();
		System.out.print("Enter a PluralNoun >>");
		PluralNoun = input.nextLine();
		
		System.out.print("Enter a number>> ");
		a = input.nextInt();
		System.out.print("Enter a number>> ");
		b = input.nextInt();
		c = a - b;
		
		System.out.print("The " + color + " Dragon is the " + wordEst + " bodyPartPlural " + anAnimal 
				+ " aNoun " + PluralNoun");
	}

}
