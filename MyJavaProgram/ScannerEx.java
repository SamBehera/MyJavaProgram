import java.util.Scanner;
class ScannerEx
{
public static void main(String Arg[])
{
Scanner name = new Scanner(System.in);
System.out.println("Enter your name: ");
String Name = name.nextLine();
System.out.println("Your name is : " + Name);
}
}