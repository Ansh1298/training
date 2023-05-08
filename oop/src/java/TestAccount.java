package java;

import com.ibm.bank.Savings;

public class TestAccount {



	public static void main(String[]args) {
		
		Savings a1=new Savings(1001,"polo");
		a1.summary();
		
		a1.withdraw(3000);
		a1.withdraw(5000);
		a1.summary();
		a1.deposit(2000);
		a1.deposit(4000);
		a1.summary();
		a1.statement();
		
	

}

}
