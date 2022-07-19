import java.util.Scanner;
class BMI
{
public static void main(String arg[])
{
Scanner bmi= new Scanner(System.in);
System.out.print("Enter the height of the person in meter:");
double h = bmi.nextDouble();

System.out.print("Enter the weight of the person in kilo:");
double w = bmi.nextDouble();

double Bmi = w / (h * h);

System.out.println("BMI: " + Bmi);
}
}