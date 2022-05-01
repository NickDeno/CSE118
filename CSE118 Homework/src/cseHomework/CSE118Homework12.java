package cseHomework;

import java.util.Random;

public class CSE118Homework12 {

	public static void main(String[] args) {
		Random rand = new Random();
		//Question 1 
		int[][] arr = new int[6][4];
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				arr[r][c] = rand.nextInt(99) + 1;
			}
		}
		
		//Question 2 test
		float[][] arr1 = { {1,2,3,4,5},{6,7,8} };
		for(int r = 0; r< arr1.length; r++) {
			for(int c = 0; c< arr1[r].length; c++) {
				System.out.printf("%.2f\t", arr1[r][c]);
			}
			System.out.println();
		}
		
		System.out.println();
		double[] arr2 = convert2DArrayTo1DArray(arr1);
		for(int i = 0; i< arr2.length;i++) {
			System.out.printf("%.2f\t", arr2[i]);
		}
		
		//Question 4 test
		System.out.println();
		int m = 5;
		int n = 4;
		int[][] arr3 = new int[m][n];
		arr3 = initalizeArray(arr3);
		for(int r = 0; r< arr3.length; r++) {
			for(int c = 0; c< arr3[r].length; c++) {
				System.out.printf("%d\t", arr3[r][c]);
			}
			System.out.println();
		}
		
		
	}
	//a
	public static int[] findMaxMin(int[][] arr) {
		int max = arr[0][0];
		int min = arr[0][0];
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				if(arr[r][c] > max) {
					max = arr[r][c];
				}
				
				if(arr[r][c] < min) {
					min = arr[r][c];
				}
			}
		}
		return new int[] {max,min};
	}
	
	//b
	public static double findAverage(int[][] arr) {
		int sum = 0;
		int count = 0;
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				sum += arr[r][c];
				count++;
			}
		}
		return (double)(sum/count);
	}
	
	//c
	public static int elementsGreaterThenAver(double average, int[][] arr) {
		int count = 0;
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				if(arr[r][c] > average) {
					count++;
				}
			}
		}
		return count;
	}
	
	//d
	public static int[] indexOfSmallestElem(int[][] arr) {
		int idx1 = 0;
		int idx2 = 0;
		
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				if(arr[r][c] <arr[idx1][idx2]) {
					idx1 = r;
					idx2 = c;
				}
			}
		}
		return new int[] {idx1,idx2};
		
	}

	//Question 2
	public static double[] convert2DArrayTo1DArray(float[][] m){
		//Find size of 2d array
		int size = 0;
		for(int r = 0; r< m.length; r++) {
			for(int c = 0; c< m[r].length; c++) {
				size++;
			}	
		}
		
		//Initialize 1d array with size of 2d array
		double[] newArr =  new double[size];;
		
		//Copy values from 2d array into 1d array
		int count = 0;
		for(int r = 0; r< m.length; r++) {
			for(int c = 0; c< m[r].length; c++) {
				newArr[count] = m[r][c];
				count++;
			}	
		}
		return newArr;
		
	}
	
	//Question 3
	public static double[][] addMatricies(double[][] m1, double[][] m2){
		double[][] m3 = new double[m1.length][m1[0].length];
		for(int r = 0; r< m3.length; r++) {
			for(int c = 0; c< m3[r].length; c++) {
				m3[r][c] = m1[r][c] + m2[r][c];
			}	
		}
		return m3;
	}
	
	//Question 4
	public static int[][] initalizeArray(int[][] arr){	
		int count = 1;
		for(int r = 0; r< arr.length; r++) {
			if(r % 2 == 0) {
				for(int c = 0; c< arr[r].length; c++) {
					arr[r][c] = count;
					count++;
				}
			}
			else {
				for(int c = arr[r].length-1; c>=0; c--) {
					arr[r][c] = count;
					count++;
				}
			}
		}
		return arr;
	}

}
