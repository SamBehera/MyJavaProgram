/*Write a java program to implement primitive typecasting.*/

class TypeCast
{
	public static void main(String[] Args)
	{	
		L2S();
		S2L();

		System.out.println("Q-Spider BTM.");
	}
	public static void L2S() //Narrowing
	{
	float a = 10.5f;
	int b= (int)a; //Explicite typecasting
	System.out.println("Typed value =" + a);
	System.out.println("Type casting from Float to Integer ="+ b);
	}

	public static void S2L() //Widening
	{
	int x = 100;
	float y = x; // Implicit typecasting
	System.out.println("Value of x = " + x); 
	System.out.println("Value of y = "+ y); 

	
	}
}