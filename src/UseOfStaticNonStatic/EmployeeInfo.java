package UseOfStaticNonStatic;

public class EmployeeInfo 
{

	public static void main(String[] args) 

	{
		Emp e1=new Emp();
		e1.empName="Amol";
		e1.empID=101;
		//e1.empCEOName="abc"; // non static variable
		Emp.empCEOName="abc";  // static variable
		
		Emp e2=new Emp();
		e2.empName="Rahul";
		e2.empID=102;
		//e2.empCEOName="abc";    // non static variable
		Emp.empCEOName="abc";     // static variable
		
		Emp e3=new Emp();
		e3.empName="Ganesh";
		e3.empID=103;
		//e3.empCEOName="xyz";     // non static variable
		Emp.empCEOName="xyz";      // static variable
		
		e1.empInfo();   // call from different class 
		e2.empInfo();
		e3.empInfo();
	}

}
