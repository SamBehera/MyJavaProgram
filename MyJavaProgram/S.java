class S
{
	public static void main(String []Arg)
	{
	add(20,30);
	
	float x = 20.5f;
	float y = 32.2f;
 
	int a=(int)x;
	int b=(int)y;
	add2(a,b);
	}
	public static void add(float a, float b)
	{
	float c = a+b;
	System.out.println("Value of c =" + c);
	}
	public static void add2(int x, int y)
	{
	int z = x+y;
	System.out.println("Value of z =" + z);
	}
}