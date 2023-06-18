package typesofvariables1;




public class demo4 
{
	//Example3: Non-static global variable
	
		int c=30; // non-static global variable
		
		public static void main (String[] args)
		
		{
			// non-static global variable call from same class
			
			demo4 d4=new demo4();    // step1: create object of same class
			System.out.println(d4.c); // variableClass : objectName.variableName  // 30
			
			System.out.println("---------------------");
			
			// non-static global variable call from diffclass
		
			demo5 d6=new demo5();    // step1: create object of same class
			System.out.println(d6.d); // variableClass : objectName.variableName 
		
		}
			
		//public static void m1()
		{
			//demo4 d5=new demo4();
			//System.out.println(d5.c);//it will not show in output because it will not asked by main method
		
		}
		//public  void m2()
		{
			//System.out.println(c);	// variableName // it will not show in output because it will not asked by main method
		}


}
