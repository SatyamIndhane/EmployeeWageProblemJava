package empwage;

public class EmployeeWageComputationProblem
{  
	// Class Constants
	public final String company;
	public final int wagePerHour;
	public final int workingDayPerMonth;
	public final int totalWorkingHours;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	// Class Variables
	public static int totalSalary=0;
	public static int empHrs=0;
	public static int dayCount=0;
	public static int hourCount=0;
	
	// Constructor
	public EmployeeWageComputationProblem(String company, int wagePerHour, int workingDayPerMonth, int totalWorkingHours)
	{
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDayPerMonth = workingDayPerMonth;
		this.totalWorkingHours = totalWorkingHours;
	}
	
	
	// Main 
	public static void main(String[] args) 
	{
		// dMart
		EmployeeWageComputationProblem dMart = new EmployeeWageComputationProblem("dMart", 20, 20, 100);
		int dmartSalary = wageCal(dMart);
		
		// Reliance
		EmployeeWageComputationProblem reliance = new EmployeeWageComputationProblem("Reliance", 10, 30, 200);
		int relianceSalary = wageCal(reliance);
		
		System.out.println("Dmart's Wage is "+dmartSalary);
		System.out.println("Reliance's Wage is "+relianceSalary);
		
	}
	
	// Multiple Companies Wage Calculation Method
	public static int wageCal(EmployeeWageComputationProblem o)
	{
		while ( dayCount<o.workingDayPerMonth && hourCount<o.totalWorkingHours )
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
		
		totalSalary = hourCount * o.wagePerHour; 
		return totalSalary;
	}
	

}

