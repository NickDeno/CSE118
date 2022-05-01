package cseHomework;

import java.util.Random;

import java.util.Scanner;

public class CSE118Homework4 {

	public static void main(String[] args) {
		var linebreak = "\n";
		
		//Question 1
		double PI = 3.14159265;
		double roundedPI = (int)(PI* 10000 +.5) /10000.0;
		System.out.println(PI + " rounded off at 4 decimal places is " + roundedPI + linebreak);
		
		//Question 2
		double milesToKm = 20 * 1.6;
		double minutes = 1 * 60.0 + 21 + 34/60.0;
		double kmPerHour = milesToKm/minutes * 60.0;
		double roundedKmPerHour = (int)(kmPerHour * 100 + .5)/100.0;
		System.out.println("The average speed of the runner is " + roundedKmPerHour + " Km/hour" + linebreak);
		
		//Question 3
		Random rand = new Random();
		int rand1 = rand.nextInt(200);
		int rand2 = rand.nextInt(81);
		int rand3 = rand.nextInt(10 + 10 + 1) -10;
		double rand4 =  10 + rand.nextDouble() * 89;
		System.out.println("1st number: " + rand1 + ", 2nd number: " + rand2 + ", 3rd number: " + rand3 + ", 4th number: " +rand4 + linebreak);
		
		//Question 4 Part 1
		int randInt = rand.nextInt(999 - 100 + 1) + 100;
		var check = (randInt % 2 == 0) ? "even number" : "odd number";
		System.out.println(randInt + " is an " + check );
		
		/*Question 4 Part 2
		Checks if randInt is divisible by 7 and 11. If it is, it displays randInt divided by 7 and randInt divided by 11.
		If not, it displays that randInt is not divisible by 7 or 11. 
		*/
		var divisible = (randInt % 7 == 0 && randInt % 11 == 0) ? (randInt + "/7 = " + (randInt/7) +", " + randInt + "/11 = " + (randInt/11)) : (randInt + " is not divisible by 7 and 11");
		System.out.println(divisible);
		
		/*Question 4 Part 3
		First checks if randInt is divisible by 9 or 13. If it is, then it checks which number it is divisible by. If it is divisible by 9, it will
		display randInt divided by 9 and vice versa with 13. If it is divisible by neither, it will display randInt is not divisible by 9 or 13 
		*/
		if(randInt % 9 == 0 || randInt % 13 ==0) {
			var check2 = (randInt % 9 == 0) ? (randInt + " is divisible by 9: " + randInt + "/9 = " + (randInt/9)) : (randInt + " is divisible by 13: " + randInt + "/13 = " + (randInt/13)) ;
			System.out.println(check2);
		}
		else {
			System.out.println(randInt + " is not divisible by 9 or 13");
		}	
		
		/* Question 4 Part 4
		Checks if randInt is divisible by 5 or 12, if it is then it checks which number it is divisible by and displays the result. If
		randInt is not divisible by either number, it displays that randInt is not divisible by 5 or 12. If randInt is divisible by 5 and 12,
		it displays that randInt is not exclusive because it is divisible by both numbers.
		*/
		if(randInt % 5 == 0 ^ randInt % 12 ==0) {
			var check3 = (randInt % 5 == 0) ? (randInt + " is divisible by 5: " + randInt + "/5 = " + (randInt/5)) : (randInt + " is divisible by 12: " + randInt + "/12 = " + (randInt/12)) ;
			System.out.println(check3);
		}
		else if(randInt % 5 != 0 && randInt % 12 != 0) {
			System.out.println(randInt + " is not divisivle by 5 or 12");
		}
		else {
			System.out.println(randInt + " is divisible by both 5 and 12 making it not exclusive");
		}
		
		//Question 5 
		System.out.println("");
		int randInt2 = rand.nextInt(12) + 1;
		switch(randInt2) {
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Fall");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		}
		
		/*Question 6
		Checks if the first digit of number is greater then the second digit. If it is, the digits get swapped and display new number.
		If the first digit is not bigger, the number stays the same. 
		*/
		System.out.println("");
		int randInt3 = rand.nextInt(90) + 10;
		int dig1 = randInt3 /10;
		int dig2 = randInt3 % 10;
		if(dig1 > dig2) {
			int temp = dig1;
			dig1 = dig2;
			dig2 = temp;
		}
		System.out.println("The original number was " + randInt3 + ", the new number is " + (dig1 * 10 + dig2) + "\n" );
		
		/*Question 7
		Checks each digit in number to see if its >= 5 or <5. If the digit is >=, the variable greater gets 1 added to it.
		If the digit is <5, the variable less gets 1 added to it. Then at the end, variables greater and less are displayed.
		*/
		int randInt4 = rand.nextInt(9999 - 1000 + 1) + 1000;
		int greater = 0;
		int less = 0;
		System.out.println("4 digit number: " + randInt4);
		var checkDigit =  (randInt4/1000 >= 5) ? (greater++) : (less++);
		checkDigit = (randInt4 % 1000 /100 >= 5) ? (greater++) : (less++);
		checkDigit = (randInt4 % 100 /10 >=5)? (greater++) : (less++);
		checkDigit = (randInt4 % 10 >=5) ? (greater++) : (less++);
		System.out.println("There are " + greater + " digits greater or equal to 5, and there are " + less + " digits less then 5" + "\n");
		
		//Question 8
		//Determines if inputed x and y coordinates are on the x or y-axis, or one of the quadrants.
		System.out.println("Enter x and y coordinates: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		if(x == 0 && y == 0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is on the origin");
		}
		else if(x != 0 && y ==0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is on the x-axis");
		}
		else if(x == 0 && y != 0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is on the y-axis");
		}
		else if(x > 0 && y > 0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is in Quadrant 1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is in Quadrant 2");
		}
		else if( x < 0 && y < 0) {
			System.out.println("The point " + "(" + x + "," + y +")" + " is in Quadrant 3");
		}
		else {
			System.out.println("The point " + "(" + x + "," + y +")" + " is in Quadrant 4");
		}		
		input.close();
	}

}
