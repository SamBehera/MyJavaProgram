class Example
{
static int k = 10;
static
	{
	System.out.println("I will execute first");
	}
public static void sub()
{
	int a=100;
	int b= 50;
	System.out.println(a-b);
}
public static void main(String[] Arg)
{
	System.out.println("Main Starts");
	sub();
	System.out.println("Main Ends");

}
}