package Constructor;

public class sample7 
{
      
	
	// example 4: user defined constructor --> multiple constructor
	
 
	   int num1;
       int num2;
       String name;

      // user defined without / zero parameter
    sample7()
   {
      num1=10;
      num2=20;
   }
    // user defined with 2 int (int, int) parameter constructor
    sample7(int a, int b)
    {
    	num1=a;
    	num2=b;
    }
  
// user defined constructor with string parameter
    
    sample7(String s1) // smita
    {
    	name=s1;  // Smita    	
    }
    
    public void studentName()
    {
    	System.out.println(name);
    } 
    
    
    public void add()
    {
    	System.out.println(num1+num2);
    }


   public static void main(String[] args) 
   {
	sample7 s7=new sample7();
	s7.add();//30
	
	System.out.println("---------");
	
	sample7 s8=new sample7(5,6);
	s8.add();
	
	System.out.println("-----------");
   
	sample7 s9=new sample7("Smita");
	s9.studentName();
   
   }
}