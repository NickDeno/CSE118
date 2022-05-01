package cseHomework;

import java.util.Scanner;

import java.util.Random;

public class CSE118Homework8 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		
	}
	public static void question1() {
		Random rand = new Random();
		int even = 0;
		int sum = 0;
		
		for(int i = 0; i <100; i++) {
			int randInt = rand.nextInt(100) + 1;
			//Added the i!=0 to avoid blank line being printed at the beginning
			if(i != 0 && i % 10 == 0) {
				System.out.println();
			}
			if(randInt % 2 == 0) {
				even++;
			}
			sum+= randInt;
			System.out.printf("%d\t", randInt);
		}
		System.out.printf("\n" + "Even count: %d, Odd count: %d, Sum: %d, Average: %.2f\n", even, (100-even), sum, (sum/100.0));
		
	}
	public static void question2() {

		Scanner input = new Scanner(System.in);
		System.out.println("\n" + "Enter a string:");
		String userStr = input.nextLine();
		String reverseStr = "";
		
		for(int i = userStr.length()- 1; i>=0; i--) {
			reverseStr += userStr.charAt(i);
		}
		System.out.printf("Orignal String: %s\nNew String: %s\n", userStr, reverseStr);
	}
	public static void question3() {
		Random rand = new Random();
		int randInt = rand.nextInt(100000) + 1;
		System.out.printf("\n" + "Randomly generated number: %d\n", randInt);
		
		int reverseNum = 0;
		for(; randInt!= 0; randInt /= 10) {
			int rem = randInt % 10;
			reverseNum = reverseNum * 10 + rem;
			
		}
		System.out.printf("Reversed Random Number: %d\n", reverseNum);
		
	}
	public static void question4() {
		Random rand = new Random();
		int dig1 = rand.nextInt(10);
		int dig2 = rand.nextInt(10);
		
		if(dig1 == dig2) {
			while(dig1 == dig2) {
				dig2 = rand.nextInt(10);
			}
		}
		System.out.printf("\n" + "2-digit lottery number: %d%d\n", dig1, dig2);
	}
	
	public static void question5() {
		Scanner input = new Scanner(System.in);	
		System.out.println("\n" + "Enter a positive integer:");
		int n = input.nextInt();
		
		double sum = 1;
		for(int i = 2; i<= n; i++) {
			sum = (i % 2 == 0) ? sum - 1.0/i : sum + 1.0/i;
		}
		System.out.printf("sum(%d) = %f\n" , n, sum);
	}
	
	public static void question6() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.printf("\n" + "%d\t", num2);
		
		for(int i = 1; i <30; i++) {
			sum = num1 + num2;
			if(i % 6 == 0) {
				System.out.println();
			}
			System.out.printf("%d\t", sum);
			num1 = num2;
			num2 = sum;
			
		}
	}
	
	public static void question7() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("\n" + "Enter a string:");
		
		String str1 = input.nextLine();
		String str2 = "";
		for(int i = 0; i<str1.length() ; i ++) {
			if(str1.charAt(i) == ' ' && str1.charAt(i+1) == ' ') {
				continue;
			}
			else {
				str2 += str1.charAt(i);
			}
		}
		System.out.printf("Original String: %s\nNew String: %s\n",str1, str2);
		
	}
	

}
