

import java.util.Scanner;

public class CalenderWithoutComments {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a year:");
		int chosenYear = input.nextInt();
	
		System.out.println("Enter a day to start at(Sunday=0, Monday=1, Tuesday=2,....,Saturday=6):");
		int chosenDay = input.nextInt();
	
		printCalender(chosenDay,chosenYear);	
		input.close();
	}
	
	public static void printCalender(int offset, int chosenYear) {
		for(int i = 0; i<=11;i++) {
			offset = printMonth(i,offset,chosenYear);
		}	
	}
	
	private static int printMonth(int num,int offset,int chosenYear) {
		String[] getMonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("                     " + getMonth[num] + " " + chosenYear);
		System.out.println("------------------------------------------------------");
		System.out.printf(" Sun\t Mon\t Tue\t Wed\t Thu\t Fri\t Sat\t\n");
		
		int count = offset;
		int startingOffset = 0;
		if(count !=7) {
			for(int i = count; i>0; i--) {
				System.out.printf("\t");
			}
			startingOffset = count;
		}
		else {
			startingOffset = 0;
		}
		
		int day = 1;	
		for(int i = startingOffset; i<getMaxDays(num,chosenYear) + startingOffset  ;i++) {
			if(i % 7 == 0 && i !=0) {
				System.out.println();
				count = 0;
			}
			
			System.out.printf("%4d\t", day);
			day++;
			count++;
		}
		System.out.println();
		System.out.println();
		
		return count;
	}	
	
	private static int getMaxDays(int num, int chosenYear) {
		if(num ==0 || num == 2 || num == 4 || num == 6 || num == 7 || num == 9|| num == 11 ) {
			return 31;
		}
		else if(num == 3 || num == 5 || num == 8|| num == 10) {
			return 30;
		}
		else if(num == 1 && checkLeapYear(chosenYear) == true) {
			return 29;
		}
		else {
			return 28;
		}
	}
	
	private static boolean checkLeapYear(int chosenYear) {
		if((chosenYear % 4 == 0 && chosenYear % 100 !=0) || chosenYear% 400 == 0)  {
			return true;
		}
		else {
			return false;
		}				
	}
}
