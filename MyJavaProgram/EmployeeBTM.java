class EmployeeBTM
{
static String Branch = "BTM";
	String Empname, Designation, Institute;
	int Empid, Salary;
public void DisplayEmployee()
{
System.out.println("\n Institute " + Institute + ", "+ Branch);
System.out.println("\n Employee Name: " + Empname);
System.out.println("\n Employee ID: " + Empid);
System.out.println("\n Designation: " + Designation);
System.out.println("\n Salary: " + Salary);
System.out.println("");
}

public static void main(String[] Arg)
{
EmployeeBTM E1 = new EmployeeBTM();
E1.Institute = "Qspiders"; 
E1.Empname = "Saumitri Behera";
E1.Empid = 546826;
E1.Designation = "Student";
E1.Salary = 47000;
E1.DisplayEmployee();

EmployeeBTM E2 = new EmployeeBTM();
E2.Institute = "Qspiders"; 
E2.Empname = "Saumitri Behera";
E2.Empid = 546826;
E2.Designation = "Student";
E2.Salary = 47000;
E2.DisplayEmployee();

EmployeeBTM E3 = new EmployeeBTM();
E3.Institute = "Qspiders"; 
E3.Empname = "Saumitri Behera";
E3.Empid = 546826;
E3.Designation = "Student";
E3.Salary = 47000;
E3.DisplayEmployee();
}
}