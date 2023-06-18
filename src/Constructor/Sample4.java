package Constructor;

public class Sample4
{
  // step1: declaration
	int num3; //50
	int num4; //30
	
	// step2: initialization
	// use1:initialise global variable
	// use2: copy all the members of class into object
	
	Sample4()    // user defined  constructor
	{
		num3=50;
		num4=30;
	}
	
	// step3: usage
	public void sub()
	{
		System.out.println(num3-num4);
	}
	
	
	
}
