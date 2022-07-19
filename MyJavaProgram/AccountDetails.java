class AccountSBI
{
	String IFSC = "SBI1000";
	long AccountNo;
private double Balance;
	String AccountHolder;

public double getBalance()
{
return Balance;
}
public void setBalance(double Balance)
{
this.Balance=Balance;
}
}


class AccountDetails
{
public static void main(String[] Arg)
{
AccountSBI ob1 = new AccountSBI();
ob1.AccountNo = 7954265;
ob1.AccountHolder = "Saumitri";
ob1.setBalance(50000d);
System.out.println(ob1.getBalance());
System.out.println(ob1.IFSC);
}
}