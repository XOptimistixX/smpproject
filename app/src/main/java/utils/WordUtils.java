package utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;

/**
 * Created by Jeff on 4/4/2016.
 */
public class WordUtils
{
	public static void processSentence(String rawInput)
	{
		//ArrayList<String> words = (ArrayList<String>) Arrays.asList(rawInput.split(" "));

		String wnhome = System . getenv (" WNHOME ") ;
		String path = wnhome + File. separator + " dict ";
		URL url = null;
		try
		{
			url = new URL("http://wordnetweb.princeton.edu/perl/webwn");
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
			System.out.println("malform");
		}

		IDictionary dict = new Dictionary (url) ;
		try
		{
			dict.open() ;
		} catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("deg");
		}

		IIndexWord idxWord = dict.getIndexWord("dog", POS.NOUN);
		IWordID wordID = idxWord.getWordIDs().get(0);
		IWord word = dict.getWord(wordID);
		System.out.println("Id = " + wordID);
		System.out.println(" Lemma = " + word.getLemma());
		System.out.println(" Gloss = " + word.getSynset().getGloss());
	}
}
