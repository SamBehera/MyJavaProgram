class LocValue
{
	public static void main(String[] Args)
	{	
		int x=5;
		System.out.println("main value" + x);
		local();
	}

	public static void local()
	{
	int x= 10;
	System.out.println("main valu." + x);
	}
}
