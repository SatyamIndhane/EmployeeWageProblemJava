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
	
	//	Variables
		
		int salary = 0;
		int empCheck = (int) Math.floor( ( Math.random()*10 )%3 );
		
		
		switch(empCheck)
		{
			case IS_FULL_TIME:
				salary = FULL_DAY_HOUR*WAGE_PER_HOUR;
				break;
			case IS_PART_TIME:
				salary = PART_TIME_HOUR*WAGE_PER_HOUR;
				break;
		}
			
		System.out.println("Employee's Daily Wage is "+salary);   // This is slow
	//  System.out.printf("Employee's Daily Wage is %d",salary);     This is fast
			
		
		

	}

}
