/*Write a java program to add 2 floating point numbers using method. 
The values should be passed form the main method. (Actual argument to formal argument)*/

class Add
{
	public static void main(String [] A)
	{
		float x= 10.50f;
		float y= 5.50f;
		Sum(x,y);
	}

	public static void Sum(float A, float B)
	{
	float R = A+B;
	System.out.println("Result after addition = " +R);	
	}
}