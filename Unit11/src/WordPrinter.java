//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public void printWord(String word, int times)
	{
		for (int i = 1; i <= times; i++) {
			System.out.println(word);
		}
	}
}