package this_keywords;

public class demo1 
{

     int a=20;                                     // global variable 
     
     public void m1()
     {
    	 int a=10;                                // local variable 
    	 
    	 System.out.println(a); // 10
     }


     public static void main(String[] args)
     
     {
    	 
    	 demo1 d1=new demo1();
    	 d1.m1();
     
     
     }




}
