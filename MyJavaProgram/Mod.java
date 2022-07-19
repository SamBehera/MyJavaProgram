class Mod
{
	public static void main(String[] Arg)
	{	
	int a = 25;
	int b = 3;
	int C= Modular(a,b);
	System.out.println("Returned value "+ C);
	}
public static int Modular(int x, int y)
	{	
	int z=x%y;
	System.out.println("value of Z= "+ z);
	return (z);
	}
}