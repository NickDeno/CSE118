package cseHomework;

import java.util.Scanner;

public class CSE118Homework2 {

	public static void main(String[] args) {
		
		//Question 1a
		double y0 = 90;
		float y1 = 0;
		y1 = (float)y0;
		System.out.println("y0 = " + y0 + ", y1 = " + y1);
		
		//Question 1b
		int x0 = 99;
		short x1 = 0;
		x1 = (short) x0;
		double newx1 = x1 /2.0;
		System.out.println("x0 = " + x0 + ", x1 = " + newx1);
		
		//Question 2
		System.out.println("Input 3 floating-point numbers:");
		Scanner input = new Scanner(System.in);
		float n1 = input.nextFloat();
		float n2 = input.nextFloat();
		float n3 = input.nextFloat();
		float sum = n1 + n2 + n3;
		System.out.println("The sum of numbers " + n1 +", " + n2 + ", and " +n3 + " is " +sum);
		
		//Question 3
		System.out.println("Input a number for vx and for vy:");
		int vx = input.nextInt();
		int vy = input.nextInt();
		System.out.println("vx= " + vx +"; vy= " + vy);
		int temp2 = vx;
		vx = vy;
		vy = temp2;
		System.out.println("vx= " + vx +"; vy= " + vy); 
		
		//Question 4
		System.out.println("Enter a floating point number:");
		float x = input.nextFloat();
		float function = (float) ((1.0/2.0) * (x * x * x) + (1.0/2.0) * (x * x) - 5 * x +8);
		System.out.println("function f(" + x + ") = " + function + "\n");
		
		//Question 5
		double radius1 = 15;
		double radius2 = 10;
		double c1 = 2.0 * 3.1415 * radius1;
		double c2 = 2.0 * 3.1415 * radius2;
		System.out.println("The total area of these 2 circles is " +((radius1 * radius1 * 3.1415) + (radius2 * radius2 * 3.1415)) );
		System.out.println("The total circumfrence of these 2 circles is " +(c1 + c2) + "\n");
		
		//Question 6
		double circumfrence = 50;
		double area = circumfrence / 3.1415 / 2;
		System.out.println("The circumfrence of this circle is " + circumfrence );
		System.out.println("The area of this circle is " + area);
		
		input.close();
		
	}
}
