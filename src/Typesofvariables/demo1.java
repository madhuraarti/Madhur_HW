package Typesofvariables;

public class demo1 
{
int b=20; // global variable
	public void m1()
{
	int a=10;   // local variable
	System.out.println(a);//10
	System.out.println(b);//20
}

public void m2()
{
		//System.out.println(a);
	
	System.out.println(b);//20
}

;
public static void main(String[] args)
{
	demo1 d1=new demo1();
	d1.m1();
	d1.m2();
}




}
