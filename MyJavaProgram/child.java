public interface I1 
{
	int var=28;			//By default final in nature
	void Sample();		//Abstract method
	static void Print() 	//Non-static method
	{
		System.out.println("Static method from Interface I1");
	}
}

public interface I2
{
	int k=50;
	void Second();
	static void display()
	{
		System.out.println("Static method from Interface I2");
	}
}

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
	I1.Print();
}
}