package Conditional_Statement;

public class Assignment_no1_nested_if
{
	public static void main(String[] args)
	{
	int Online_Shopping_amount=350;
	int Online_Shopping_greater_onethousand=350;
	
	
if (Online_Shopping_amount>=500) // outer if
	{
	    System.out.println("Eligible for free home delievery");
		if ( Online_Shopping_greater_onethousand>=1000)	// nested if or inner if
		{
			 System.out.println("congratulations also you will get 10% discount");
		}
		
		else
		{
			System.out.println("Sorry you are not eligible for 10% discount");
		}
				
	}
 else
	{
	    	System.out.println("Not Eligible for free home delievery you have to pay additional charge");
	}
	

}
	
	
}
