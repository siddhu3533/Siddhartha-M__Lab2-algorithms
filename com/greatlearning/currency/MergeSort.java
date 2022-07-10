package com.greatlearning.currency;

public class MergeSort {
	
	public void mergesort(int[] sortArray, int left, int right) {
		if(left< right)
		{
			int mid = (left+right)/2;
			mergesort(sortArray,left,mid);
			mergesort(sortArray,mid+1,right);
			merge(sortArray,left,mid, right);
		}
	}
	
	public void merge(int[] sortArray, int left, int mid, int right) {
		int n1=mid-left+1;
		int n2= right-mid;
		//create new left and right sub arrays.
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		//copy elements to left and right sub arrays.
		for(int i =0; i<n1; i++)
		{
			leftArray[i] = sortArray[left+i];
		}
		for(int j =0; j<n2; j++)
		{
			rightArray[j] = sortArray[mid+1+j];
		}
		//create sorted array.
		int i=0,j =0;
		int k = left;
		while(i<n1 && j < n2 ) {
			if(leftArray[i]>=rightArray[j])
			{
				sortArray[k] = leftArray[i];
				i++;
			}
			else
			{
				sortArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		//copy remaining elements of sub arrays to sorted array.
		while(i<n1) {
			sortArray[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			sortArray[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
