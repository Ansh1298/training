package com.ibm.bank;

public interface Bank{

    // int init_acc_no=1001;
	// double min_savings_bal=1000;
	// double overdraft_lim=10000;


    void summery();
    void deposit(double amount);
    void withdraw(double amount);
    void  statement();
    
}

