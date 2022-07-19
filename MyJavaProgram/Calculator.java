class Calculator
{
 	
public static void main(String[] A)

	{
	int x= 100;
	int y= 10;
	int z;
	
	Subsctraction(x,y); //Actual arguments
	Addition(x,y);
	
	//Division();
	//Multiplication();
}

public static void Addition(int p, int q) //Formal argumenr
{
	int R=p+q;
	System.out.println("Add result "+ R);
}
public static void Subsctraction(int p1, int q1)
{
	int R1=p1+q1;
	System.out.println("Sub result "+ R1);
}
/*public static void Division()
{

	System.out.println("Div result "+ z);
}
public static void Multiplication()
{
	
	System.out.println("Multi result "+ z);
}*/


}

