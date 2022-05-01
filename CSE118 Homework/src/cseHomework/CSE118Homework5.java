package cseHomework;

import java.util.Scanner;

public class CSE118Homework5 {

	public static void main(String[] args) {
		//Question 1
		int rand1 = (int)(1 + Math.random() * 9);
		int rand2 = (int)(1 + Math.random() * 9);
		var var1 = (rand1 > rand2) ? rand1 : rand2; 
		System.out.println("The greater number of " + rand1 + " and " +rand2 + " is " + var1 + "\n");
		
		//Question 2 Part 1
		int rand3 = (int)(Math.random() * 18);
		
		if(rand3 == 0) {
			System.out.println("January");
		}
		else if(rand3 == 1) {
			System.out.println("February");
		}
		else if(rand3 == 2) {
			System.out.println("March");
		}
		else if(rand3 == 3) {
			System.out.println("April");
		}
		else if(rand3 == 4) {
			System.out.println("May");
		}
		else if(rand3 == 5) {
			System.out.println("June");
		}
		else if(rand3 == 6) {
			System.out.println("July");
		}
		else if(rand3 == 7) {
			System.out.println("August");
		}
		else if(rand3 == 8) {
			System.out.println("September");
		}
		else if(rand3 == 9) {
			System.out.println("October");
		}
		else if(rand3 == 10) {
			System.out.println("Novmeber");
		}
		else if(rand3 == 11) {
			System.out.println("December");
		}
		else {
			System.out.println("Invalid");
		}
		
		//Question 2 Part 2	
		switch(rand3){
		case 0:
			System.out.println("January");
			break;
		case 1:
			System.out.println("February");
			break;
		case 2:
			System.out.println("March");
			break;
		case 3:
			System.out.println("April");
			break;
		case 4:
			System.out.println("May");
			break;
		case 5:
			System.out.println("June");
			break;
		case 6:
			System.out.println("July");
			break;
		case 7:
			System.out.println("August");
			break;
		case 8:
			System.out.println("September");
			break;
		case 9:
			System.out.println("October");
			break;
		case 10:
			System.out.println("November");
			break;
		case 11:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
		//Question3
		int rand4 = (int)(Math.random() * 10000);
		if((rand4 % 2 == 0 && rand4 % 3 == 0)||(rand4 % 2 == 0 && rand4 % 5 == 0)||(rand4 % 3 == 0 && rand4 % 5 == 0)){
			System.out.println("\n" + rand4 + " is divisible by 2 of these numbers");
		}
		else {
			System.out.println("\n" + rand4 + " is not divisible by 2 of these numbers");
		}
		
		//Question 4
		int randInt1 = (int)(Math.random() * 10);
		int randInt2 = (int)(Math.random() * 10);
		int randInt3 = (int)(Math.random() * 10);
		int randInt4 = (int)(Math.random() * 10);
		
		int maxValue = Math.max(Math.max(randInt1, randInt2),Math.max(randInt3,randInt4));
		int minValue = Math.min(Math.min(randInt1, randInt2),Math.min(randInt3,randInt4));
		System.out.println("\n" + "The max value of " + randInt1 + ", " + randInt2 + ", " + randInt3 + ", and " + randInt4 + " is " + maxValue + " and the min value is " + minValue);
		
		//Question5
		System.out.println("\n" + "Enter a number between 11 and 99:");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		if(userInput >= 11 && userInput <= 99) {
			System.out.println("Your number is " + userInput);
		}
		else if(userInput <= 11) {
			userInput = 11;
			System.out.println("Your number was lower then 11 so it was changed to " + userInput);
		}
		else {
			userInput = 99;
			System.out.println("Your number was higher then 99 so it was changed to " + userInput);
		}
		
		//Question 6 Part 1
		double doub1 = 5.5;
		double doub2 = 2.5;
		if(Math.abs(doub1-doub2) < .0000001 ) {
			System.out.println("\n" + "The numbers " + doub1 + " and " + doub2 + " are equal");
		}
		else {
			System.out.println("\n" + "The numbers " + doub1 + " and " + doub2 + " are not equal");
		}
		//Question 6 Part 2
		var checkEqual = (doub1 == doub2) ? " are equal" : " are not equal";
		System.out.println("The numbers " + doub1 + " and " + doub2 + checkEqual);
		
		//Question 7
		char ch = 'C';
		System.out.println("\n" + "The character chosen is " + ch);
		
		char ch2 = (char)(ch- 1);
		if((ch2 >= 'A' && ch2 <= 'Z')||(ch2 >= 'a' && ch2 <= 'z')){
			System.out.println("The charcter right before " + ch + " is " +ch2 + " and its a letter");
		}
		else {
			System.out.println("The charcter right before " + ch + " is " + ch2 + " and its a letter");
		}
		
		char ch3 = (char)(ch + 3);
		if(ch3 >= '0' && ch3 <= '9') {
			System.out.println("The 3rd charcter after  " + ch + " is " +ch3 + " and its a digit");
		}
		else {
			System.out.println("The 3rd charcter after " + ch + " is " +ch3 + " and its not a digit");
		} 
		
		//Question 8
		System.out.println("\n" + "Enter lengths for each side of triangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double hypotenuse = Math.max(Math.max(a, b), c);
		if(hypotenuse * hypotenuse == a*a + b*b) {
			System.out.println("The triangle with the sides " + a + ", " + b + ", and " + c + " is a right triangle ");
		}
		else {
			System.out.println("The triangle with the sides " + a + ", " + b + ", and " + c + " is not a right triangle ");
		}
		
		input.close();
	}

}
