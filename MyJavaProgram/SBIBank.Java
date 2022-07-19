class SBIBank
{
 static String Bank = "State Bank of India";
	String Branch, IFSC,  ACHolder;
	long ACnum;
static
{
System.out.println("\n OOP CONCEPT \n");  //Static Block
}
{
System.out.println(" \n One SBI Account is created. "); //NSI block
}


public void AccountDetails()
{
System.out.println("\n Bank Name & Branch: " + Bank +", " + Branch );
System.out.println("\n Account holder name:  "+ ACHolder);
System.out.println("\n A/C no: " + ACnum);
System.out.println("\n IFSC Code: " + IFSC);
}

public static void main(String[] Arg)
{
SBIBank C1 = new SBIBank();
C1.Branch = "Bangalore";
C1.IFSC = "SBI000012069";
C1.ACHolder = "Saumitri Behera";
C1.ACnum = 30909204;
C1.AccountDetails();
}
}
