package Interface;

class child implements I1, I2
{
	int x;
	public void Sample()
	{
		System.out.println("Given implementation for the abstract method of I1");
	}
	
	public void Second()
	{
		System.out.println("Implementation for abstract method of I2");
	}
	
public static void main(String[] args) 
{
	child c1 = new child();
	c1.Sample();
	c1.Second();
//	I1 ob=new child();
//	ob.Sample();
//	I2 ob1=new child();
//	ob1.Sample();
	
	I1.Print();
	I2.Print();
}
}