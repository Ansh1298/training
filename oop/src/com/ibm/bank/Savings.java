package com.ibm.bank;

public class Savings extends Accounts {

    public Savings(){

    }
    public Savings(int actNo,String holder){
        super(actNo, holder, 1000);
    }
    //override method
    public void withdraw(double amount){
        if(amount<=(balance-min_savings_bal))
            balance-=amount;
        else System.out.println("insufficient balance");    

    }
    @Override
    public void summary() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'summery'");
    }
    
}

