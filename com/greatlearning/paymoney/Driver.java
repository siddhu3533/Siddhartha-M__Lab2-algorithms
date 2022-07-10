package com.greatlearning.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayMoney obj = new PayMoney();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entire the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		System.out.println("Entire the values in array i.e transactions in crores");
		for(int i =0; i< size; i++)
		{
			transactions[i] = sc.nextInt();
		}
		obj.setTransactions(transactions);
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalNoTarget = sc.nextInt();
		for(int i =0; i< totalNoTarget; i++)
		{
			System.out.println("Entire the value of target");
			int target = sc.nextInt();
			int position = obj.targetAchieved(target);
			if(position != -1)
			{
				System.out.println("Target achieved after "+(position+1)+" transactions");
			}
			else {
				System.out.println("The target is not achieved");
			}
			
		}
		
		sc.close();
		
	}

}
