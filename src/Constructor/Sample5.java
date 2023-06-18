package Constructor;

public class Sample5 
{

// declaration
	int num1;
	int num2;
	// Step2: initialization 
	// user defined constructor with 2 int (int,int) parameter
	// use1: to initialise global variable
	Sample5(int a, int b) // 10,20  // declaration 
	{ 
       num1=a;    // 10       // assign local variable info into global variable
       num2=b;    // 20
	}

// step3: usage
	public void add()
	{
		System.out.println(num1+num2);
	}

	public void mul()
	{
		System.out.println(num1*num2);
		
	}


public static void main(String[] args)
{
	Sample5 s5 = new Sample5(10,20);  // initialization of local variable
	s5.add(); // 30
	s5.mul(); // 200
	
	System.out.println("------------");
	
	Sample5 s6 = new Sample5(5,6);  // initialization of local variable
	s6.add(); // 11
	s6.mul(); // 30
	System.out.println("------------");
	
	Sample6 s7 = new Sample6(8,6); 
	s7.sub(); //2
	
	System.out.println("------------");
	
	Sample6 s8 = new Sample6(80,60); 
	s8.sub(); // 20
	
}


}






