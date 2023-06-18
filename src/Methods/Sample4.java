package Methods;

public class Sample4

{

	// main method
	public static void main(String[] args) // pre-defined method

	{
		System.out.println("Hi");
		// classroom objectname =new classname ();    // step1: creat an object / instance of class
		Sample4 s4= new Sample4();
		s4.m5() ;                                            // step2: method call--> objectname.methodnamw();
		s4.m6();
		s4.m6();
		
	//1: sample4--> classname --> as a datatype (object type)
	//2: s4 --> objectName ---> use to identity/refer object	
	//3: new --> keywords --> use to creat blank/empty object
	//4: Sample4() ---> classname() --> constructor--> use to copy all the members of class into object	
	
	
	
	}
	
	


// non static -> regular method
	public void m5()
	
	{
		System.out.println("non - static regular method m5 from same class");
	}
	
	// non static -> regular method
	
		public void m6()
		
		{
			System.out.println("non - static regular method m6 from same class");
		}




}
