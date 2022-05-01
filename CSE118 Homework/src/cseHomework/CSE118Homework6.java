package cseHomework;

import java.util.Random;

import java.util.Scanner;

public class CSE118Homework6 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
	
		//Question 1
		char ch1 = (char) (rand.nextInt(26) + 'a');
		System.out.println("Random lowercase letter: " + ch1);
		
		char ch2 = (char)(rand.nextInt(10) + '0');
		System.out.println("Random digit character: " + ch2);
		var check = (ch2 < '5') ? "yes" : "no";
		System.out.println(check);
			
		int rn = rand.nextInt(61);
		char ch3 = 0;
		if(rn < 26) {
			ch3 = (char)('A' + rn );
		}
		else if(rn > 26 && rn < 52) {
			ch3 = (char)('a' +(rn-26));
		}
		else {
			ch3 = (char)('0' + (rn-51));
		}
		System.out.println(ch3);
		
		//Question 2
		System.out.println("\n" + "Enter 2 messages: ");
		String str1 = new String(input.nextLine());
		String str2 = new String(input.nextLine());
		
		// a and b
		System.out.println("The length of string1 is " + str1.length() + " and the length of string2 is " + str2.length());
		System.out.println("The first and last characters of string1 is " + str1.charAt(0) + " and " + str1.charAt(str1.length()-1));
		System.out.println("The first and last characters of string2 is " + str2.charAt(0) + " and " + str2.charAt(str2.length()-1));
		
		//c
		boolean b1 = str1.equals(str2);
		System.out.println("\n" + "The strings are equal(case sensitive): " + b1);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println("The strings are equal(case insensitive): " + b2);
		
		//d
		int b3 = str1.compareTo(str2);
		int b4 = str1.compareToIgnoreCase(str2);
		var checkString = (b3 < 0) ? "String1 is smaller then string2(case sensitive) " : "String1 is not smaller then string2(case sensitive)" ;
		var checkString2 =(b4 < 0) ? "String1 is smaller then string2(case sensitive) " : "String1 is not smaller then string2(case sensitive)" ;
		System.out.println("\n" + checkString + "\n" + checkString2);
		
		
		// e and f
		String str3 = str1.toUpperCase();
		String str4 = str2.toLowerCase();
		System.out.println("\n" + "Uppecase string1: " + str3);
		System.out.println("Lowercase string2: " + str4);
		
		//g
		char chr1 = str1.charAt(0);
		char chr2 = str1.charAt(str1.length() - 1);
		char chr3 = str2.charAt(1);
		char chr4 = str2.charAt(str2.length() -2);
		String str5 = "" + chr1 + chr2 + chr3 +chr4;
		System.out.println("\n" + str5);
		
		//h
		int idx1 = str1.indexOf(' ');
		int idx2 = str1.lastIndexOf(' ');
		int idx3 = str2.indexOf(' ');
		int idx4 = str2.lastIndexOf(' ');
		String newStr = str1.substring(0, idx1) + str1.substring(idx2) + str2.substring(0 , idx3) + str2.substring(idx4);
		System.out.println(newStr);

		//Question 3
		System.out.println("\n" + "Enter a string:");
		String userStr = input.nextLine();
		System.out.println("Original String: " + userStr);
		int length = userStr.length();
		
		char firstCh = userStr.charAt(0);
		char lastCh = userStr.charAt(length - 1);
		String middle = userStr.substring(1 , length - 1);
		
		String newUserStr = "" + lastCh + middle + firstCh;
		System.out.println(newUserStr);
		
		//Question 4
		System.out.println("\n" + "Enter 5 character string: ");
		String inputStr = input.nextLine();
		String reverseStr = "" + inputStr.charAt(inputStr.length() - 1) + inputStr.charAt(inputStr.length() - 2) + inputStr.charAt(inputStr.length() - 3) + inputStr.charAt(inputStr.length() - 4) + inputStr.charAt(inputStr.length() - 5);
		
		var check2 = (inputStr.equals(reverseStr)) ? "String is a palindrome" : "String is not palindrome";
		System.out.println(check2);
		
		//Question 5
		int random1 = rand.nextInt(15);
		int random2 = rand.nextInt(15);
		int random3 = rand.nextInt(15);
		int random4 = rand.nextInt(15);
		char hex1 = 0;
		char hex2 = 0;
		char hex3 = 0;
		char hex4 = 0;
		
		//Random hex number for hex1
		if(random1 <9) {
			hex1 = (char)('0' + random1);
		}
		else {
			hex1 = (char)('A' + (random1 - 9));
		}
		//random hex number for hex2
		if(random2 <9) {
			hex2 = (char)('0' + random2);
		}
		else {
			hex2 = (char)('A' + (random2 - 9));
		}
		//Random hex number for hex3
		if(random3 <9) {
			hex3 = (char)('0' + random3);
		}
		else {
			hex3 = (char)('A' + (random3 - 9));
		}
		//Random hex number for hex4
		if(random4 <9) {
			hex4 = (char)('0' + random4);
		}
		else {
			hex4 = (char)('A' + (random4 - 9));
		}
		String hexNumber = "0x" + hex1 + hex2 + hex3+ hex4;
		System.out.println("\n" + "4-digit Hexadecimal number: " +hexNumber);
		
		//Question 6
		System.out.println("meter(s)  feet     Inch(es)");
		int meters = 1;
		float feet = (float)(meters * 3.28084);
		float inches = feet * 12;
		System.out.printf("%d\t %5.2f %12.2f\n" , meters, feet, inches );
		
		meters++;
		float feet2 = (float)(meters *3.28084);
		float inches2 = feet2 *12;
		System.out.printf("%d\t %5.2f %12.2f\n" , meters, feet2, inches2);
		
		meters++;
		float feet3 = (float)(meters * 3.28084);
		float inches3 = feet3 *12;
		System.out.printf("%d\t %5.2f %12.2f\n" , meters, feet3, inches3 );
		
		input.close();
	}

}
