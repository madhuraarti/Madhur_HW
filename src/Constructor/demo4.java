package Constructor;

public class demo4 
{

	// example 4: user defined constructor --> multiple constructor
	
	   int num1;
    int num2;

   // user defined without / zero parameter
 demo4()
{
   num1=10;
   num2=20;
}

 public void add()
 {
 	System.out.println(num1+num2);
 }


public static void main(String[] args) 
{
	demo4 s7=new demo4();
	s7.add();//30
}


}
