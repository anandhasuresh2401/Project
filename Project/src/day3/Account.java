package day3;
import java.util.*;
public class Account {
	long accNum;
	public long getAccNum()
	{
		return accNum;
		
	}
	public void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	public double getBalance()
	{
		return Balance;
	}
	public void setBalance(double balance)
	{
		Balance = balance;
	}
	double Balance;
	void deposit(double a)
	{
		Balance=Balance+a;
		
	}
	void withdraw(double b)
	{
		Balance=Balance-b;
	}

	

}
