package cseHomework;

import java.util.Random;

public class CSEHomework11 {

	public static void main(String[] args) {
		
		//Question 2 
		int[] array = {1,3,5,7,9,11};
		double[] values = findMaxMinAverage(array);
		System.out.printf("The maximum element %d is found at %d\nThe minimum element %d is found at %d\nThe average value of this is %f",
				(int)values[0], (int)values[1], (int)values[2],(int)values[3],values[4]);
		
		//Question 3 
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
		int[] arr3 = {1,3,5,7,9,11};
		System.out.println("\n" + checkArrays(arr1,arr2));
		System.out.println(checkArrays(arr1,arr3));
		
	}
	
	//Question 1
	public static int[] generateArray(int arraySize, int lowerBound, int upperBound) {
		Random rand = new Random();
		int[] arr = new int[arraySize];
		
		for(int i = 0; i< arraySize; i++) {
			arr[i]= rand.nextInt(upperBound-lowerBound + 1) + lowerBound;
		}
		return arr;
		
	}
	
	//Question 2
	public static double[] findMaxMinAverage(int[] arr) {
		int total = 0;
		
		// get max value and idx
		int max = arr[0];
		int maxIdx = 0;
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
			total += arr[i];
		}
		
		//get min value and idx
		int min = arr[0];
		int minIdx = 0;
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIdx = i;
			}
		}
		return new double[] {max,maxIdx,min,minIdx,(double)total/arr.length};
		
	}
	
	//Question 3, returns 1 if arrays are same, returns 0 if not
	public static int checkArrays(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return 0;
		}
		
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return 0;
			}
		}
		return 1;
	}
	
	//Question 4
	public static int[] reverseArray(int[] arr) {
		for(int i = 0;i <arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
		return arr;
	}
	
	//Question 5
	public static boolean isArraySorted(int[] arr) {
		boolean isSorted = true;
		//Check if array is ascending sorted
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		
		//If array is ascending sorted, there is no need to check if its descending sorted
		if(isSorted) {
			return true;
		}
		
		isSorted = true;
		//Check if array is descending sorted
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i] < arr[i+1]) {
				isSorted = false;
				break;
			}
		}	
		return isSorted;
	}
	
	//Question 6
	public static int[] reorganizeArray(int[] arr) {
		int leftPoint = 0;
		int rightPoint = arr.length-1;
		
		while(leftPoint<rightPoint) {
			//Increments from left side until even number is found
			while(arr[leftPoint] % 2 ==1) {
				leftPoint++;
			}
			
			//Decrements from right side until odd number is found
			while(arr[rightPoint] % 2 == 0) {
				rightPoint--;
			}
			
			//Swaps the even and odd number found only when left is less then right to prevent unnecessary swaps
			if(leftPoint < rightPoint) {
				int temp = arr[leftPoint];
				arr[leftPoint] = arr[rightPoint];
				arr[rightPoint]= temp;
				
				leftPoint++;
				rightPoint--;
			}
		}
		return arr;
	}
}
