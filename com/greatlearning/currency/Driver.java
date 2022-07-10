package com.greatlearning.currency;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyNotes cnObj = new CurrencyNotes();
		MergeSort msObj = new MergeSort();
		Scanner sc = new Scanner(System.in);
		int[] currencyArray;
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrencyArray = sc.nextInt();
		if(sizeOfCurrencyArray<1)
		{
			System.out.println("Invalid size of currency denominations");
			sc.close();
			return;
		}
		cnObj.setNoOfDenominations(sizeOfCurrencyArray);
		currencyArray = new int[sizeOfCurrencyArray];
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<sizeOfCurrencyArray; i++) {
			currencyArray[i]= sc.nextInt();
		}
		//Sort the currency array in descending order
		msObj.mergesort(currencyArray,0, sizeOfCurrencyArray-1);
		cnObj.setNotes(currencyArray);
		System.out.println("Enter the amount you want to pay");
		int target = sc.nextInt();
		cnObj.minNumberOfNotes(target);
		sc.close();
	}

}
