/*Write a java prgrma to verify if the given value of the variable is <500.
If <500, add that value with 100;
else add the value with 200. Print the values after addition */

class Verify
{
	public static void main(String[] Arg)
	{
	int num  = 300;

	if (num <500)
	{
		int T= num+100;
		System.out.println("True " + T);
	}

	else
	{
		int F = num + 200;
		System.out.println("False " + F);
	}
	}
}