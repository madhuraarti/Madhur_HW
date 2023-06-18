package staticnonstaticva;

public class empinfo 
{

	public static void main(String[] args) 

	{
		emp e1=new emp(); // initialization of variable
		e1.empName="Amol";
		e1.empID=101;
		e1.empCEOName="abc"; // non static variable
		
		
		emp e2=new emp();
		e2.empName="Rahul";
		e2.empID=102;
		e2.empCEOName="abc";    // non static variable
		
		
		emp e3=new emp();
		e3.empName="Ganesh";
		e3.empID=103;
		e3.empCEOName="xyz";     // non static variable
		
		
		e1.empInfo();   // call from different class 
		e2.empInfo();
		e3.empInfo();

	}

}
