package empwage;

public class EmpAbsentOrPresent 
{
	public static void main(String[] args) 
	{
	//	Constants
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_HOUR = 4;
		int WORKING_DAY_PER_MONTH = 20;
		int TOTAL_WORKING_HOUR = 100;
	
	//	Variables
		
		int totalSalary=0;
		int empHrs=0;
		int dayCount=0;
		int hourCount=0;
		int salary = 0;
		
		
		while ( dayCount<WORKING_DAY_PER_MONTH && hourCount<TOTAL_WORKING_HOUR )
		{	
			int empCheck =  (int) Math.floor( ( Math.random()*10 )%3 );
			switch(empCheck)
			{
				case IS_FULL_TIME:
					salary = FULL_DAY_HOUR*WAGE_PER_HOUR;
					empHrs = 8;
					break;
				case IS_PART_TIME:
					salary = PART_TIME_HOUR*WAGE_PER_HOUR;
					empHrs = 4;
					break;
				default:
					empHrs = 0;
					salary = 0;
			}
			totalSalary = totalSalary + salary;
			hourCount = hourCount + empHrs;
			dayCount++;
		}
		
		System.out.println("Employee's Monthly Wage is "+totalSalary);   // This is slow
	//  System.out.printf("Employee's Monthly Wage is %d",totalSalary);     This is fast
			
		
		

	}

}
