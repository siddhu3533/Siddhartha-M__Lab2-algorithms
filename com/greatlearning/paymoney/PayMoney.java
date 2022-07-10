package com.greatlearning.paymoney;

public class PayMoney {
	
	int [] Transactions;
	public int[] getTransactions() {
		return Transactions;
	}
	public void setTransactions(int[] transactions) {
		Transactions = transactions;
	}
	public int targetAchieved(int target) {
		int totalTrans = 0;
		for(int i=0 ; i< Transactions.length; i++) {
			totalTrans = totalTrans + Transactions[i];
			if(totalTrans >= target)
			{
				return i;
			}
		}
		return -1;
	}

}
