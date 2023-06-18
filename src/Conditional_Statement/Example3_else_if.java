package Conditional_Statement;

public class Example3_else_if
{

	public static void main(String[] args)
	
	{
			int marks=34;
			
			if(marks>=65) // condition --> true
			{
			System.out.println("Distinction");	
		    }
			
			else if (marks>=60 & marks<=64)// Range in between 60 to 64
			{
				System.out.println("First Division");	
			}

			else if (marks>=50 & marks<=59)// Range in between 50 to 59
			{
				System.out.println("Second Division");	
			}
	
			else if (marks>=35 & marks<=49)// Range in between 35 to 49
			{
				System.out.println("Pass");	
			}
	
			else if (marks<35)// less then 35 
			{
				System.out.println("Fail");	
			}
			
			
	}

}
