

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FinalProject118 {

	private static String fileName = "sample.dat";
	
	public static void main(String[] args) {
		
		// read test scores from "sample.dat"
		int [] scores = readTestScores(fileName);
		
		//Stores all stats from scores array such as max grade, min grade, mean, median.....
		double [] stats = getStats(scores);
		// continue to complete project
		// (0) 
		System.out.printf("Statistic information of the test: \n");
		
		// (step-1) display information: The total number of testers: 
		System.out.printf("Total number of testers: %d\n", scores.length);
		
		// (2) get and display information: highest/lowest score, 
		System.out.printf("Highest-lowest scores:\n");		
		System.out.printf("-- highest: %d\n-- lowest : %d\n", (int)stats[0], (int)stats[1]);
		
		// (3) calculate "mean" and "median" 
		System.out.printf("Mean and Median scores:\n");
		System.out.printf("-- mean  : %.2f\n-- median: %.2f\n", stats[2],stats[3]);
		
		// (4) calculate "standard derivation" 
		System.out.printf("Standard derivation:\n");		
		System.out.printf("-- standard deviation: %.2f\n", stats[4]);

		// (5) calculate distribution: "percentage of grades" + display data in "histogram" 
		System.out.printf("Distribution:\n");		
		for(int i = 0; i<5; i++) {
			//Prints distribution for A-D
			if(i<4) {
				printDistribution(i,stats[i+5],scores.length);
			}
			//Print distribution for F(i+1 is passed through instead of i. This is to ensure "Grade F"\ is printed and not "Grade E"
			else { 
				printDistribution(i+1,stats[i+5],scores.length);
			}
		}
		
		//Prints Distribution for "All Grades"
		System.out.printf("-- All Grades:\t%.2f %s   ",(scores.length/scores.length)*100.0, "%");
		for(int i = 0; i<scores.length; i++) {
			System.out.print("*");
		}
		
		
	}
	
	//Calculates max grade, min grade, mean, median, deviation and how many students got each grade. These values are returned into array stats in main method
	public static double[] getStats(int[] arr) {
		arr = organizeArray(arr);
		
		int max = arr[arr.length-1];
		int min = arr[0];
		double median = (arr.length % 2 == 0) ? ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2 : arr[arr.length/2] ;
		double mean = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		for(int i = 0; i<arr.length; i++) {
			a = (arr[i] >=90 && arr[i] <= 100) ? a+1 : a;
			b = (arr[i] >=80 && arr[i] <= 89) ? b+1 : b;
			c = (arr[i] >=70 && arr[i] <= 79) ? c+1 : c;
			d = (arr[i] >=60 && arr[i] <= 69) ? d+1 : d;
			f = (arr[i] >=0 && arr[i] <= 59) ? f+1 : f;
			
			mean += arr[i];
		}
		mean = (int)((mean/arr.length)* 100 + .5)/100.0;
		
		double deviation = 0;
		for(int i = 0; i<arr.length; i++) {
			deviation += ((arr[i] - mean)*(arr[i] - mean)) / (arr.length - 1);
		}
		deviation = (int)(Math.sqrt(deviation) * 100 + .5)/100.0;
		
		
		return new double[] {max,min,mean,median,deviation,a,b,c,d,f};
	}

	//Takes in an array and organizes it in ascending order. This method is called in getStats to organize the array scores
	private static int[] organizeArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
	         for(int j = i + 1; j < arr.length; j++) {
	            if(arr[i] > arr[j]) {
	            	int temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	        }
		}
		return arr;
	}
	
	//This method calculates the distribution of grades and prints histogram for that grade. This method is called in a loop in main method
	public static void printDistribution(int letterOffset , double num , int length) {
		System.out.printf("-- Grade %s:\t %.2f %s   ", (char)('A'+ letterOffset), (num/length)*100.0, "%");
		for(int i = 0; i<num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static int [] readTestScores(String fileName) {
		ArrayList<Integer> scoreList = new ArrayList<>();
		try (DataInputStream dis = new DataInputStream(new FileInputStream(new File(fileName)))) 
		{
			while (dis.available() > 0) {
				scoreList.add(dis.readInt());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		int [] scores = new int[scoreList.size()];
		int i = 0;
		for (Integer value : scoreList) {
			scores[i++] = value;
		}
		return scores;
	}
}

