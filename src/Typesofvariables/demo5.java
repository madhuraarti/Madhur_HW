package Typesofvariables;

public class demo5

{

//Example3: Non-static global variable
	
	int c=30; // non-static global variable
	
	public static void main (String[] args)
	
	{
		// non-static global variable call from same class
		demo5 d5=new demo5();    // step1: create object of same class
		System.out.println(d5.c); // variableClass : objectName.variableName  // 30
		
	}
		
	public static void m1()
	{
		demo5 d6=new demo5();
		System.out.println(d6.c);
	
	}
	public  void m2()
	{
		System.out.println(c);	// variableName 
	}



}
