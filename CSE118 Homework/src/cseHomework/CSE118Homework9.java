package cseHomework;

import java.util.Random;
import java.util.Scanner;

public class CSE118Homework9 {

	public static void main(String[] args) {
		//Question 1
		System.out.println(isPrime(5));//Displays true, 5 is prime
		System.out.println(isPrime(14));//Displays false, 14 is not prime
		System.out.println(generateRandomNumber(0,10));
		
		//Question 2
		System.out.printf("\n" + "%b, %b, %b\n", checkIfHex("0xabc123XYZ"),checkIfHex("abc123XYZ"),checkIfHex("0xabc123?$@"));
		
		
		//Question 4
		System.out.println("\n" + convertToHHMMSS(12345));
		System.out.println(convertToHHMMSS(50000));
		
		//Question 5
		//5b Displaying Tables
		System.out.printf("\n" + "char \tdec \thexadec\n");
		System.out.println("=======================");
		for(int i = 0; i<=9; i++) {
			System.out.printf("%s \t%s \t%s\n", (char)('0' + i), getASCIICode((char)('0' + i),true), getASCIICode((char)('0' + i),false));
		}
	
		System.out.printf("\n" + "char \tdec \thexadec\n");
		System.out.println("=======================");
		for(int i = 0; i<26; i++) {
			System.out.printf("%s \t%s \t%s\n", (char)('A' + i), getASCIICode((char)('A' + i),true), getASCIICode((char)('A' + i),false));
		}
		
		System.out.printf("\n" + "char \tdec \thexadec\n");
		System.out.println("=======================");
		for(int i = 0; i<26; i++) {
			System.out.printf("%s \t%s \t%s\n", (char)('a' + i), getASCIICode((char)('a' + i),true), getASCIICode((char)('a' + i),false));
		}
		
		//Question6
		System.out.println("\n" + isValidPassword("Abcdef123")); //Displays true
		System.out.println(isValidPassword("1Abcdef123")); //Displays false, first char is a digit
		System.out.println(isValidPassword("Abcd$ef123"));//Displays false, $ is not digit or letter
		System.out.println(isValidPassword("Abc123"));//Displays false, is not at least 8 characters long
	}
	
	//Question 1a Method
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i = 2; i<= n/2;i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	//Question 1b Method
	public static int generateRandomNumber(int lowerBound, int upperBound) {
		Random rand = new Random();
		return rand.nextInt(upperBound-lowerBound + 1) + lowerBound;
	}
	
	//Question 2 Method
	public static boolean checkIfHex(String str) {
		if(str.charAt(0) != '0' && str.charAt(1) != 'x') {
			return false;
		}
		
		for(int i = 2; i<str.length();i ++) {
			if((str.charAt(i) >= '0' && str.charAt(i)<='9')|| (str.charAt(i) >= 'a' && str.charAt(i)<='z')|| (str.charAt(i) >= 'A' && str.charAt(i)<='z')) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	//Question 3 Method
	public static boolean isPalindrome(String str, boolean caseSensitive) {
		if(caseSensitive == true) {
			for(int i = 0; i<=str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i)){
					return false;
				}
			}
			return true;
		}
		else {
			String newStr = str.toLowerCase();
			for(int i = 0; i<=newStr.length()/2; i++) {
				if(newStr.charAt(i) != newStr.charAt(newStr.length()-1-i)){
					return false;
				}
			}
			return true;
		}
	}
	
	//Question 4 Method
	public static String convertToHHMMSS(int seconds) {
		int hours = seconds/3600;
		seconds -= hours * 3600;
		int minutes = seconds/60;
		seconds -= minutes * 60;
	
		//When hours, minutes or seconds is < 10, adds 0 infront of number. If its >= 10, it just adds the  number
		String convertedStr = ((hours<10) ? ("0" + hours + ":") : (hours + ":")) + ((minutes<10) ? ("0" + minutes + ":") : (minutes + ":")) + ((seconds<10) ? ("0" + seconds) : seconds);
		
		return convertedStr;
	}
	
	//Question 5 Method
	public static String getASCIICode(char ch, boolean isDecimal) {
		if(isDecimal == true) {
			String decimal = "" + (int)ch;
			return decimal;
		}
		else {
			String hex = "";
			int num = (int)ch;
			while(num!=0) {
				int rem = num%16;
				num/=16;
				
				if(rem<=9) {
					hex = (char)('0' + rem) + hex;
				}
				else {
					hex =(char)('A' + (rem-10)) + hex;
				}
			}
			hex = "0x" + hex;
			return hex;
		}
	}
	
	//Question 6 Method
	public static boolean isValidPassword(String password) {
		if(password.length()-1 < 8 || (password.charAt(0) >= '0' && password.charAt(0) <= '9') ) {
			return false;
		}
		
		int digits = 0;
		for(int i = 0; i< password.length(); i++) {	
			if(password.charAt(i)>= '0' && password.charAt(i) <= '9'){
				digits++;
			}
			else if((password.charAt(i)>= 'a' && password.charAt(i) <= 'z')|| (password.charAt(i)>= 'A' && password.charAt(i) <= 'Z')) {
				continue;
			}
			else {
				return false;
			}
		}
		
		if(digits<2) {
			return false;
		}
		return true;
	}
	
}
