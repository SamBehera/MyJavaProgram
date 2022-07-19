class Mobile
{
	String brand;
	String Model;
	String Color;
	double Price;
	float size;

Mobile(String brand, String Model, String Color, double Price, float size)
	{
	this.brand = brand;
	this.Model = Model;
	this.Color = Color;
	this.Price = Price;
	this.size = size;

	}

Mobile(String brand, String Model, double Price)
	{
	this.brand = brand;
	this.Model = Model;
	this.Price = Price;
	
	}
Mobile() //Explicitly defining the default constuctor. 
{
}

public void display()
{
System.out.println("\n\nBrand: "+ this.brand +"\n Model: "+ Model + "\n Color: "+ Color + "\n Price: "+ Price +"\n Size: " + size);
}

public static void main(String[] Arg)
{
	Mobile ob1= new Mobile("OnePlus", "Nord", "Blue", 29999, 6.2f);
	Mobile ob2= new Mobile ("iPhone", "XR", 43000);
	
	Mobile ob3= new Mobile();
	ob3.brand= "Mi";
	ob3.Model= "Note";
	ob3.Color= "Black";
	ob3.display();
	
	ob2.display();
	System.out.print("\n Ob1 object disply method is calling now");
	
	ob1.display();
	System.out.print("\n Ob2 object disply method is calling now");
}
}
