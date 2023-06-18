package this_keywords;

public class demo3 
{

	int a=20;                                     // global variable 
    
    public void m3()
    {
   	 int a=10;                                   // local variable 
   	 
   	 System.out.println(a); // 10
   	 
   	 System.out.println(this.a); // 20          // this.a  is used in same value only
    
    }


    public static void main(String[] args)
    
    {
   	 
   	 demo3 d3=new demo3();
   	 d3.m3();

    }


}
