class A
{
	public static void main(String[] Args) //Caller method
	{	
		int return_value = Add(100,200);
	}
	public static int Add(int x, int y) //Called method
	{
		int C = x+y;
		System.out.println(C);
		return C;
	}
}
