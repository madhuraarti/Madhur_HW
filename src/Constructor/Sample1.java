package Constructor;

public class Sample1
{
    // default constructor---> provided by compiler
	// sample1()
	//{
	//
	//}
	
	public static void main (String[] args)
	{
		// Sample1 s1=new Sample1();
		Sample1 s1=new Sample1(); // syntax of object creation
		s1.m1();
		s1.m1();
		s1.m2();
		// 1: sample1-> classname ---> datatype
		// 2: s1--> objectName ---> to identifier/refer object
		// 3: new --> keywords --> use to create empty /blank object
		// Sample1() --> classname() --> constructor call
		
		System.out.println("----------------");
		
		Sample2 s2=new Sample2();
		s2.m3();
		s2.m3();
		
		
			}
	
	public void m1()
	
	{
		System.out.println("running method from same class m1");
	}
	
public void m2()
	
	{
		System.out.println("running method from same class m2");
	}	
}
