import java.util.Scanner;
class Arith
{
public static void main(String arg[])
{
Scanner num = new Scanner(System.in);
System.out.print("Enter the first integer:");
int num1 = num.nextInt();

System.out.print("Enter the second integer:");
int num2 = num.nextInt();

int add = num1 + num2;
int sub = num1 - num2;
int mul = num1 * num2;
int div = num1/num2;

System.out.println(num1 + "+" + num2+ "=" +add);
System.out.println(num1 + "-" + num2+ "=" +sub);
System.out.println(num1 + "*" + num2+ "=" +mul);
System.out.println(num1 + "/" + num2+ "=" +div);
}
}
