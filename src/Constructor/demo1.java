package Constructor;

public class demo1 
{
	
	// step1: Declaration of variable
		int num1;  // 10
		int num2;  // 20
		// step2: variable initialization
		// user defined constructor ---> provided by user
		// use1: initialize global variable
		// use2: copy /load all the members of class into object
		demo1()
		{
			num1=10;
			num2=20;
		}
		
		//step3: usage
		public void addition()
		{
			System.out.println(num1+num2);
		}
		
		public void multiplication()
		{
			System.out.println(num1*num2);
		}
		
		public static void main(String[] args)
		{ 
			demo1 d1=new demo1();
			d1.addition(); // 30
			d1.multiplication(); //200
			
			
			
			
		}
	

}
