package Constructor;

public class Sample3 
{
// step1: declaration of variable
	int num1;  //10
	int num2;  //20
	// step2: variable initialization
	// user defined constructor ---> provided by user
	// use1: initialize global variable
	// use2: copy/load all the members of class into object
	
	
	Sample3()
	{
		num1=10;
		num2=20;
	}
	
	// Step3: usage	
	
	
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
		Sample3 s3=new Sample3(); // user defined constructor call from same class
		s3.addition();  // 30
		s3.multiplication(); // 200
		
		System.out.println("------------");
		 
		Sample4 s4=new Sample4(); // user defined constructor call from diff class
		s4.sub(); // 20
		
		
	}

}
