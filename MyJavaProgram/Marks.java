/*Write a java program to calculate total marks of three subject each mark is out of 100.
 After that calculate percentage by designing one more method.*/


class Marks
{
	public static void main(String[] Args)
	{	
		float Mat = 96f;
		float Phy = 86f;
		float Chem = 76f;

		System.out.println(" Result \n");
		float Sum= Total(Mat, Phy, Chem);
		float Per= Percentage(Sum);
	}
	public static float Total(float M, float P, float C)
	{
		float sum = M+P+C;
		System.out.println("Total mark is= " + sum );
		return sum;
	}
	public static float Percentage(float S)
	{
		float Avg= S/300f*100f;
		System.out.println("\nPercentage mark is= " +Avg);
		return Avg;
	}
}

