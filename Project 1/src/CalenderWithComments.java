

import java.util.Scanner;

public class CalenderWithComments {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a year:");
		int chosenYear = input.nextInt();
	
		System.out.println("Enter a day to start at(Sunday=0, Monday=1, Tuesday=2,....,Saturday=6):");
		int chosenDay = input.nextInt();
	
		printCalender(chosenDay,chosenYear);	
		input.close();
	}
	
	/*This method takes in 2 parameters, offset and chosenYear. The first value of offset is set to the argument chosenDay which is what day the user chose to 
	 * start the month on. Then, a loop is run 12 time. The method printMonth is ran each time which prints the header and body of the current month. offset is 
	 * passed as an arugment for printMonth. So for the first loop, offset = chosenDay of the user. printMonth is then ran and returns the offset for that month. 
	 * This value is then stored in offset and repeats the process.
	 */
	public static void printCalender(int offset, int chosenYear) {
		for(int i = 0; i<=11;i++) {
			offset = printMonth(i,offset,chosenYear);
		}	
	}
	

	/*The first part of this method prints the header of the current month. It takes in 2 parameters, num and currentYear. So for example, if num = 0 and chosenYear = 2013, it prints
	 * the header of January 2013
	 */
	
	/* This method is called in printCalender to print the body of the month. The parameter offset takes in the argument offset which is the offset from the last month. 
	 * So if the previous month ended on a Saturday, the offset for the next month would be 6. Count is assigned to offset. Count is used to keep track of what day the week is on. 
	 * First, a loop runs that prints spaces to make the next month start where the previous one ended. So, if the previous month ended on a Saturday, count will be assigned to 6 and
	 * it will print 6 spaces for the next month.After this is done, the main loop for printing the days is started. The max value of i is to set to getMaxDays(num,chosenYear). So for
	 * example, if getMaxDays(0) is called, it will return the amount of days for the month of January. The offset from the previous month is assigned to startingOffset and added on to 
	 * (i) and getMaxDays. This to compensate for the spaces printed at the beginning. Each time the loop is run, it will first check if i%7==0. If this is true it will print a new 
	 * line and reset count = 0. Then it will print the day and increase day and count by 1. At the end, whatever value is stored in count will be returned to use as the offset for 
	 *	the next month.
	 */
	private static int printMonth(int num,int offset,int chosenYear) {
		//Prints header for the current month
		String[] getMonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("                     " + getMonth[num] + " " + chosenYear);
		System.out.println("------------------------------------------------------");
		System.out.printf(" Sun\t Mon\t Tue\t Wed\t Thu\t Fri\t Sat\t\n");
		
		//count is set to the offset from previous month
		int count = offset;
		int startingOffset = 0;
		
		//prints offset amount of spaces to ensure current month starts where last one left off
		/*This is only ran when count !=7. This is to prevent unecessasry spaces from being printed. If count was = 7, that would mean the previous month ended on saturday and would
		 * not need to be offset at all.
		 */
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
		
		//This value is then returned into previousOffset to be used in the next loop.
		return count;
	}	
	
	/*This method is called in the printMonth method. It determines the max amount of days for the current month being printed. So when the month is Jan, Mar, May, Jul, Aug, Oct, and
	 * Dec, the max days is 31. When the month is Apr, June, Sep, and Nov, the max days is 30. When the month is Feb, it first checks if the month is a leap year or not. This is done
	 * by calling the method checkLeapYear which checks if the chosen year of the user is a leap year or not. If it is a leap year, the max days for Feb is 29. If it is not, the max
	 * days is 28.
	 */
	private static int getMaxDays(int num, int year) {
		if(num ==0 || num == 2 || num == 4 || num == 6 || num == 7 || num == 9|| num == 11 ) {
			return 31;
		}
		else if(num == 3 || num == 5 || num == 8|| num == 10) {
			return 30;
		}
		else if(num == 1 && checkLeapYear(year) == true) {
			return 29;
		}
		else {
			return 28;
		}
	}
	
	/*This method checks if the year entered is a leap year. It first checks if the year is divisible by 4 and not a century(divisible by 100). If this isn't true, it then checks if
	 *  the year is divisible by 400. This extra condition is to check if the year is a century which needs to be divisible by 400 to be a leap year. If it is a leap year, return true, 
	 *  else return false
	 */
	private static boolean checkLeapYear(int year) {
		if((year % 4 == 0 && year % 100 !=0) || year% 400 == 0)  {
			return true;
		}
		else {
			return false;
		}				
	}

}

