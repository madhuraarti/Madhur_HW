package Typesofvariables;

public class demo7 
{

	//Example3: Non-static global variable
	
		int c=30; // non-static global variable
		
		public static void main (String[] args)
		
		{
			// non-static global variable call from same class
			demo7 d7=new demo7();    // step1: create object of same class
			System.out.println(d7.c); // variableClass : objectName.variableName 
			
			
			System.out.println("-------------------");
			
			demo8 d8=new demo8(); // step1: create object of diff class
			System.out.println(d8.e); // variableCall ---> diffClassobjectName.variableName
			
			
		}
			
		public static void m1()
		{
			demo7 d8=new demo7();
			System.out.println(d8.c);
		
		}
		public  void m2()
		{
			System.out.println(c);	
		}


}
