package cseHomework;

import java.util.Random;

public class CSE118Homework10 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();

	}
	public static void question1() {
		Random rand = new Random();
		int[] arr = new int[32];
		
		//a,b,c,d
		int min = arr[0];
		int total = arr[0];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = rand.nextInt(199) - 99;
			
			if(i%8 == 0 && i!= 0) {
				System.out.println();
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			System.out.printf("%d\t", arr[i]);
			total += arr[i];
		}
		double average = (double)total/arr.length;
		System.out.printf("\n" + "Smallest element = %d, Average = %f\n", min, average);
		
		//e
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > average) {
				count++;
			}
		}
		System.out.printf("Amount of elements greater then average = %d\n",count);
		
		//f
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i>0;i--) {
			arr[i] = arr[i-1];	
		}
		arr[0] = temp;		
		
		for(int i = 0; i<arr.length; i++) {
			if(i%8 ==0 && i!= 0) {
				System.out.println();
			}
			System.out.printf("%d\t", arr[i]);	
		}
	}
	
	public static void question2() {
		System.out.println();
		System.out.println();
		Random rand = new Random();
		
		//a,b,c,d
		int arrayLen = rand.nextInt(25)+ 12;
		int[] arr = new int[arrayLen];

		for(int i = 0; i< arr.length;i++) {
			if(i%10 ==0 && i != 0) {
				System.out.println();
			}
			arr[i] = rand.nextInt(201) - 100;
			System.out.printf("%d\t", arr[i]);
		}
		
		//e,f,g
		int count = 0;
		int even = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				System.out.printf("\n" + "0 found at index %d\n", i);
			}
			
			if(arr[i] == 20) {
				count++;
			}
			
			if(arr[i]%2 == 0) {
				even++;
			}
			
		}
		System.out.printf("\n" + "Occurence of 20 = %d, even count = %d, odd count = %d\n",count,even, (arr.length- even));
	}
	
	public static void question3() {
		int[] array = new int[20];
		array[0] = 0;
		array[1] = 1;
		
		System.out.printf("%d\t%d\t", array[0], array[1]);
		for(int i = 2;i<array.length;i++) {
			if(i% 5 == 0) {
				System.out.println();
			}
			array[i] = array[i-1] + array[i-2];
			System.out.printf("%d\t", array[i]);
		}
	}
	
	public static void question4() {
		int[] arr = {1,2,3,4,5,6};
		boolean isAscending = true;
		boolean isDescending = true;
		
		//Check if array is ascending sorted
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				isAscending = false;
				break;
			}
		}
		//Check if array is descending sorted
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i] < arr[i+1]) {
				isDescending = false;
				break;
			}
		}	
		
		if(isAscending == true) {
			System.out.println("\n" + "The array is ascending sorted");
		}
		if(isDescending == true) {
			System.out.println("\n" + "The array is descending sorted");
		}
	}

}
