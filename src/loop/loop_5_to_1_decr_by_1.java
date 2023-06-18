package loop;

public class loop_5_to_1_decr_by_1 
{
	public static void main(String[] args)
	{ 
		    //print num from 5 to 1
		  
		//start num:5
	    		//end num:1
	     //increment or decrement: increment by 1
	
		  //   step6   0>=1 false   <--- 0 (1-1)
		   //   step5  1>=1 true   <--- 1 (2-1)
	       //   step4  2>=1 true   <--- 2 (3-1)
		   //   step3  3>=1 true  <--- 3 (4-1)
		   //   step2  4>=1 true  <--- 4 (5-1)
//	  step1      5     5>=1 true
		for(int i=5;   i>=1   ;     i--)
		{
	       System.out.println(i);     // 5  true go to for loop body
	
	                                 //4  true go to for loop body
		
		                           // 3  true go to for loop body
	                              // 2  true go to for loop body
	                            // 1   true go to for loop body
		                       // 0 false not go to  for loop body
		
		}
   
	
	
	
	
	
	
	}
	
	
	
}
