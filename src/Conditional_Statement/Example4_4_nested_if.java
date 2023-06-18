package Conditional_Statement;

public class Example4_4_nested_if
{

	public static void main(String[] args)
	{
	int PREEXAM=350;
	int MAINEXAM=750;
	
	
if (PREEXAM>=300) // outer if
	{
	    System.out.println("Eligible for mains exam");
		if (MAINEXAM>=800)	// nested if or inner if
		{
			 System.out.println("Got Selected");
		}
		else if(MAINEXAM>=700 & MAINEXAM<800)
		{
			System.out.println("Awaited");
		}
		else
		{
			System.out.println("Rejected : MAINEXAM<800");
		}
		
			
			
	}
 else
	{
	    	System.out.println("Not Eligible for mains exam: PREEXAM<300");
	}
	

}

	


}
