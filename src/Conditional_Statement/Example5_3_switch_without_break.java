package Conditional_Statement;

public class Example5_3_switch_without_break
{

	public static void main(String[] args)
	{
		switch(1)
		{
		case 1: System.out.println("Today is monday");
		
		case 2: System.out.println("Today is Tuesday");
		
		case 3: System.out.println("Today is Wednesday");
		
		case 4: System.out.println("Today is Thrusday");
		break;
		case 5: System.out.println("Today is Friday");
		break;
		case 6: System.out.println("Today is Saturday");
		break;
		case 7: System.out.println("Today is Sunday");
		break;
		
		default: System.out.println("wrong input");
		}
	}

}
