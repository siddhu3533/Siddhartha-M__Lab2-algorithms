package com.greatlearning.currency;

public class CurrencyNotes {
	
	int notes[];
	int noOfDenominations;
	public int[] getNotes() {
		return notes;
	}
	public void setNotes(int[] notes) {
		this.notes = notes;
	}
	public int getNoOfDenominations() {
		return noOfDenominations;
	}
	public void setNoOfDenominations(int noOfDenominations) {
		this.noOfDenominations = noOfDenominations;
	}
	public void minNumberOfNotes(int amount)
	{
		NotesCount.numberOfDenominations(notes, amount);
	}

}
