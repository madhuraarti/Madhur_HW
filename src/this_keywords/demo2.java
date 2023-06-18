package this_keywords;

public class demo2 
{

 int b=20;                                     // global variable 
     
     public void m2()
     {
    	 int a=10;                                // local variable 
    	 
    	 System.out.println(b); // 20
     }


     public static void main(String[] args)
     
     {
    	 
    	 demo2 d2=new demo2();
    	 d2.m2();
     
     
     }







}
