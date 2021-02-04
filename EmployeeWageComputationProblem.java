package empwage;

public class EmployeeWageComputationProblem
{  
	
	public static void main(String[] args) 
	{
		computeEmpWage();
	}
	
	public static int computeEmpWage()
	{
		//	Constants
			final int IS_FULL_TIME = 1;
			final int IS_PART_TIME = 2;
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
				int empCheck =  (int) Math.floor( ( Math.random()*10 )%3 );
				switch(empCheck)
				{
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;
					default:
						empHrs=0;
						break;
				}
				hourCount = hourCount + empHrs;
				dayCount++;
			}
			
			totalSalary = hourCount * WAGE_PER_HOUR; 
			System.out.println("Employee's Monthly Wage is "+totalSalary);
			return totalSalary;
	}

}

