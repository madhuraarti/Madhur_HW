package Typesofvariables;

public class demo3 
{

	// 2: static global variable:
	
	static int a=10; // static --> global variable
	
	public static void main(String[] args)
	{
		// 1: static global variable call from same class --> variableName
		System.out.println(a);// 10
		
		// 2: static global variable call from diff class --> diffclassname.variableName
		System.out.println(demo4.b); // 80
	}
	
	public void m1()
{
	
	System.out.println(a);
	
}

	public void m2()
{
			
	System.out.println(a);
}



	
}


