package Typesofvariables;

public class demo2
{

	int b=20;
		
			public void m1()
		{
			int a=10;   // local variable
			System.out.println(a);
			System.out.println(b);
		}

		public void m2()
		{
				//System.out.println(a);
			
			System.out.println(b);
		}


		public static void main(String[] args)
		{
			demo2 d1=new demo2();
			
			d1.m2();
		}





}
