package model.word;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Adjective extends Word
{
	protected Noun noun;

	public Adjective(String value)
	{
		super(value);
	}

	public Noun getNoun()
	{
		return noun;
	}
}
