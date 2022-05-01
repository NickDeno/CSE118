package cseHomework;

import java.util.Scanner;

public class CSE118Homework3 {

	public static void main(String[] args) {
		
		//Question 3a
		System.out.println("Input 4 numbers:");
		Scanner input = new Scanner(System.in);
		int pos1 = input.nextInt();
		int pos2 = input.nextInt();
		int pos3 = input.nextInt();
		int pos4 = input.nextInt();
		System.out.println("pos1= " + pos1 + ", pos2= " + pos2 + ", pos3= " + pos3 + ", pos4= " + pos4);
		
		//Question 3b
		int temp = pos1;
		pos1 = pos2;
		pos2 = pos3;
		pos3 = pos4;
		pos4 = temp;
		
		System.out.println("Left shift: pos1= " + pos1 + ", pos2= " + pos2 + ", pos3= " + pos3 + ", pos4= " + pos4);
		
		//Question 3c
		int temp2 = pos1;
		pos1 = pos4;
		pos4 = pos3;
		pos3 = pos2;
		pos2 = temp2;
		System.out.println("Right shift: pos1= " + pos1 + ", pos2= " + pos2 + ", pos3= " + pos3 + ", pos4= " + pos4 + "\n");
		
		//Question 4
		System.out.println("Input 4 numbers to find average of:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		double average = (num1 + num2 + num3 + num4)/4.0;
		System.out.println("The average of the numbers " + num1 + ", " + num2 + ", " + num3 + ", and " + num4 + " is " + average + "\n");
		
		//Question 5 
		double number = 234.567;
		System.out.println("Floating-point number: " + number);
		int integer = (int)number;
		double decimal = number - integer;
		decimal = (int)(decimal * 1000)/1000.0;
		System.out.println("The integer part of the number " + number + " is " + integer + " and the decimal part is " + decimal + "\n"); 
		
		//Question 6
		System.out.println("Enter Floating-point number to convert to percent:");
		float number2 = input.nextFloat();
		float conversion = (float)(number2 * 100);
		float percentage = (float)((int)(conversion * 100)/100.0);
		System.out.println(number2 + " is " + percentage + "%" + "\n");
		
		//Question 7
		System.out.println("Enter amount of millimeters:");
		int startnumber = input.nextInt();
		int meters = startnumber/1000;
		int centimeters = (startnumber - (meters * 1000))/10; 
		int millimeters = startnumber - (meters * 1000) - (centimeters * 10);
		System.out.println(startnumber + " millimeters = " + meters + " meters " + centimeters + " centimeters " + millimeters + " millimeters" + "\n" );
		
		//Question 8
		System.out.println("Enter a 3-digit integer number:");
		int number3 = input.nextInt();
		int firstdigit = number3 /100;
		int secdigit = (number3 - (firstdigit * 100))/10 ;
		int thirddigit = number3 - (firstdigit * 100) - (secdigit * 10);
		System.out.println("The sum of each digit in the original number " + number3 + " is " + (firstdigit + secdigit + thirddigit));
		
		input.close();
	}

}
