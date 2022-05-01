package cseHomework;

import java.util.Random;

import java.util.Scanner;

public class CSE118Homework7 {

	public static void main(String[] args) {
		question1();
		question2();
		question4();
		question5();
		question6();
		question7();
		question8();
	}

	public static void question1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a postive integer number:");
		
		int n = input.nextInt();
		double sum = 0;
		int count = 1; 
		for( ; count <= n; count++ ) {
			sum += (1.0/count);
		}
		System.out.printf("sum(%d) = %f\n" , n, sum);
	}
	
	public static void question2() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n" + "Enter a string:");
		
		String str1 = input.nextLine();
		int count = 0;
		String newStr= "";
		String digStr = "";
		
		while(count < str1.length()) {
			if(str1.charAt(count) >= '0' && str1.charAt(count) <= '9') {
				digStr = digStr + str1.charAt(count);
			}	
			else {
				newStr = newStr + str1.charAt(count);
			}
			count++;
		}
		//Checks digStr which contains all digits from string to see if there in ascending order. If not returns false
		boolean bIsAscending = true;
		for(count = 1; count < digStr.length(); ) {
			if(digStr.charAt(count) >= digStr.charAt(count-1)) {
				count++;
			}
			else {
				bIsAscending = false;
				break;
			}
		}
		System.out.printf("There are %d digits in the string\n", digStr.length());
		System.out.printf("The digits %s in ascending order\n" , ((bIsAscending) ? "are": "are not"));
		System.out.printf("The string without digits is %s\n", newStr);
	
	}
	
	public static void question4() {
		Random rand = new Random();
		int n = rand.nextInt(9) + 1;
		System.out.println("\n" + "n=" + n);
		
		//a (Increasing triangle pattern)
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//b (Decreasing triangle pattern)
		System.out.println();
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//c (Decreasing right aligned triangle)	
		System.out.println();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
				
			}
			for(int j = 1; j<= n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void question5() {
		System.out.println("\n" + "Miles    Kilometers");
		int miles = 1;
		double kilometers = 0;
		for(; miles <= 10; miles++) {
			kilometers = miles * 1.609; 
			System.out.printf("%d\t %5.3f\n", miles, kilometers);
		}
	}
	
	public static void question6() {
		Random rand = new Random();
		System.out.println();
		int even = 0;
		int odd = 0;
		
		for(int count = 0; count < 1000; count++) {
			int rn = rand.nextInt(100);
			if(rn % 2 ==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.printf("There are %d even numbers and %d odd numbers", even, odd);	
	}
	
	public static void question7() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n" + "Enter number to sum the digits of:");
		int userNum = input.nextInt();
		int tempUserNum = userNum;
		
		int total = 0; 
		int lastDigit = 0;
		for(; userNum != 0; userNum /= 10) {
			lastDigit = userNum % 10;
			total+= lastDigit;
		}
		System.out.printf("The sum of the digits in %d is %d", tempUserNum, total);
	}
	
	public static void question8() {
		System.out.println();
		int count = 0;
		int divisible = 0;
		
		for(int number = 10000 ; number <=20000; number++) {	
			if(number % 13 == 0 ^ number % 11 == 0) {
				if(count % 10 == 0) {
					System.out.println();
				}	
				System.out.printf("%d\t", number);
				divisible++;
				count++;
			}
		}
		System.out.println("\n" + "There are " + divisible + " numbers divisible by 11 or 13 but not both");

	}
}
