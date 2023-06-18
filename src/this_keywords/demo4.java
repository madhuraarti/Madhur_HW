package this_keywords;

public class demo4 extends demo5

{

int a=20;                                     // global variable 
    
    public void m4()
    {
   	 int a=10;                                   // local variable 
   	 
   	 System.out.println(a); // 10
   	 
   	 System.out.println(this.a); // 20          // this.a  is used in same value only
   	 
   	 System.out.println(super.a); //30          // global variable from super class     
    }


    public static void main(String[] args)
    
    {
   	 
   	 demo4 d4=new demo4();
   	 d4.m4();

    }




}
