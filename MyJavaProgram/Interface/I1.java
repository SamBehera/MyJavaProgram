package Interface;

public interface I1 
{
	int var=28;			//By default final in nature
	void Sample();		//Abstract method
	static void Print() 	//Non-static method
	{
		System.out.println("Static method from Interface I1");
	}
}