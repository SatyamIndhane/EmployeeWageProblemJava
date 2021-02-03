package empwage;

public class EmployeeWageComputationProblem
{
	//Class Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;  
	
	public static void main(String[] args) 
	{
	//	Constants
		int WAGE_PER_HOUR = 20;
		int WORKING_DAY_PER_MONTH = 20;
		int TOTAL_WORKING_HOUR = 100;
	
	//	Variables	
		int totalSalary=0;
		int empHrs=0;
		int dayCount=0;
		int hourCount=0;
			
		while ( dayCount<WORKING_DAY_PER_MONTH && hourCount<TOTAL_WORKING_HOUR )
		{							
			empHrs = getEmployeeHours();
			hourCount = hourCount + empHrs;
			dayCount++;
		}
		
		totalSalary = hourCount * WAGE_PER_HOUR; 
		System.out.println("Employee's Monthly Wage is "+totalSalary); 
		
	}
	
	public static int getEmployeeHours()
	{
		int empCheck =  (int) Math.floor( ( Math.random()*10 )%3 );
		switch(empCheck)
		{
			case IS_FULL_TIME:
				return 8;
			case IS_PART_TIME:
				return 4;
			default:
				return 0;
		}
	}

}

