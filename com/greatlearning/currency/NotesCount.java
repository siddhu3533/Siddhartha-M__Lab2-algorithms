package com.greatlearning.currency;

public class NotesCount {
	
	public static void numberOfDenominations(int notes[], int amount)
	{
		int [] notesCounter = new int[notes.length];
		try {
			for(int i=0; i<notes.length&& amount>0; i++)
			{
				if(amount>=notes[i])
				{
					notesCounter[i] = amount/notes[i];
					amount = amount - notes[i]*notesCounter[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cannot be given with currency denominations");
			}
			else
			{
				System.out.println("Your Payment approach in order to give min no of notes will be");
				for(int i =0; i< notesCounter.length ; i++)
				{
					if(notesCounter[i]>0)
					{
						System.out.println(notes[i]+":"+notesCounter[i]);
					}
				}
			}			
		}
		catch(ArithmeticException e) {
			System.out.println("Arthmectic Exception "+e.getMessage());
			}
		}

}
