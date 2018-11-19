package arrayLists;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		Scanner chopper = new Scanner(wordList);
		words = new ArrayList<Word>();
		while(chopper.hasNext())
		{
			words.add(new Word(chopper.next()));
		}





	}
	
	public int countWordsWithXChars(int size)
	{
		int count = 0;
		for(int i = 0; i < words.size(); i++)
			if(words.get(i).getLength() == size)
				count++;
		return count;
	}


	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int count = 0;
		for(int i = words.size() - 1; i >= 0;  i--) {
			if(words.get(i).getLength() == size) {
				count += words.get(i).getNumVowels();
				words.remove(i);
			}
		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count = 0;
		for(int i = 0; i < words.size(); i++)
			if(words.get(i).getNumVowels() == numVowels)
				count++;

		return count;
	}
	
	public String toString()
	{
	   return "" + words;
	}
}