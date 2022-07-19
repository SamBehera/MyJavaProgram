class ArithEx
{
	public static void main(String [] A)
	{
	int num = 30, b = 3, x = 0;
	char c= '*';
switch (c)
{
case '+':
	{
	x = num + b;
	System.out.println("Result after Addition = " +x);
	break;
	}
case '-':
	{	
	x = num - b;				
	System.out.println("Result after Subsctraction= " +x);
	break;
	}
case '*':
	{
	x = num * b;
	System.out.println("Result after Multiplication= " +x);
	break;
	}	
case '/':
	{
	x = num / b;
	System.out.println("Result after Division= " +x);
	break;
	}
case '%':
	{
	x = num % b;
	System.out.println("Result after Mod= " + x);
	break;
	}

default : 	
	System.out.println("No operation performed");
	}

}
}
