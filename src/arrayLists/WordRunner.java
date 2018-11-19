package arrayLists;

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word demo = new Word("chicken");
		System.out.println(demo + "\n" + "num vowels == " + demo.getNumVowels() + "\n" + "num chars == " + demo.getLength() + "\n");
	
		demo.setWord("alligator");
		System.out.println(demo + "\n" + "num vowels == " + demo.getNumVowels() + "\n" + "num chars == " + demo.getLength() + "\n");
	
		demo.setWord("elephant");
		System.out.println(demo + "\n" + "num vowels == " + demo.getNumVowels() + "\n" + "num chars == " + demo.getLength() + "\n");
	}
}