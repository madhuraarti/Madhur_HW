package Sample1;

public class studentname4

{
	public static void main(String[] args)
	 
	 {
		studentName("Priyanka"); 
		studentName("Amol");
		System.out.println("--------------------");
		studentFullName("Madhur","Chauhan");
		studentFullName("Aarna","Singh");
		System.out.println("--------------------");
		studentname5.studentInfo("Kuldeep",105,65.5f,'B');
		studentname5.studentInfo("Madhur",12345,65.6f,'A');
		System.out.println("--------------------");
		studentname6.studentinfo("Rahul",15,55.5f,'C');
		System.out.println("--------------------");
		studentname6.studentinfo("Ram",75,85.5f,'A');
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
