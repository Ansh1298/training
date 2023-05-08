package com.ibm.bank;

public abstract class Accounts implements  Bank {
	
	public static final int init_acc_no=1001;
	public static final double min_savings_bal=1000;
	public static final double overdraft_lim=10000;

	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen=init_acc_no;

	protected Transaction[] txns;
	protected int idx;
	
	public Accounts () {
	}
	
	public Accounts (int acntNo, String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns=new Transaction[10];
		
		Transaction t=new Transaction("0B",balance,balance);
		txns[idx]=t;
		idx++;
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("balance: " + balance);
	
		
	}
	// BL Methods
	public void deposit (double amount) {
				balance += amount;
				txns[idx++]=new Transaction("CR",amount,balance);
	}
	public abstract void withdraw (double amount);

	public void statement(){
		System.out.println("TSatement of A/c:"+actNo);
		System.out.println("Type\Amount\tBalance");
		for(int i=0;i<idx;i++)
		txns[i].print();
	}
		
	
	

}
