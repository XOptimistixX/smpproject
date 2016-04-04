package model.word;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Adverb extends Word
{
	protected Verb verb;

	public Adverb(String value)
	{
		super(value);
	}

	public Verb getVerb()
	{
		return verb;
	}
}
