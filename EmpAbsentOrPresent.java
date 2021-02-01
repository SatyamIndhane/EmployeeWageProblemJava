package empwage;

public class EmpAbsentOrPresent 
{
	public static void main(String[] args) 
	{
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int salary = 0;
		double empCheck = Math.floor( ( Math.random()*10 )%2 );
		
		
		if (empCheck == IS_FULL_TIME)
			salary = FULL_DAY_HOUR*WAGE_PER_HOUR;
			
		System.out.println("Employee's Daily Wage is "+salary);
	//  System.out.printf("Employee's Daily Wage is %d",salary);
			
		
		

	}

}
