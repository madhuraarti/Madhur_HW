package Sample1;

public class studentname3 

{

	public static void main(String[] args)
	 
	 {
		studentName("Priyanka"); 
		studentName("Amol");
		System.out.println("--------------------");
		studentFullName("Madhur","Chauhan");
		studentFullName("Aarna","Singh");
		 
	 }

	// method with string parameter
	public static void studentName(String s1)

	{
		
	System.out.println(s1);

	}
	// with with string, string
	public static void studentFullName(String firstname,String sirname)

	{
		
	System.out.println(firstname +" "+ sirname);

	}





}
