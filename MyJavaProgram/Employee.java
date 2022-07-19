class Person
{
String name;
int age;
Person(String name, int age)
	{
	this.name=name;
	this.age=age;
	}
void displayPer()
	{
	System.out.println("show details person");
	}

}

class Employee extends Person
{
String designation;
int empid;
double salary;
Employee(String name, int age, String designation, int empid, double salary)
	{
	super(name, age);
	this.designation = designation;
	this.empid = empid;
	this.salary=salary;
	}
void displayEm()
	{
	System.out.println("show details");
	}
public static void main(String arg[])
{
Employee e = new Employee("sam", 29, "manager", 555, 50000);
e.displayEm();
Person p= new Person("sam", 29);
p.displayPer();

}
}
