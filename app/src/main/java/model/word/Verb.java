package model.word;

import java.util.ArrayList;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Verb extends Word
{
	protected Noun subject;
	protected Noun object;

	private ArrayList<Adverb> adverbs;

	public Verb(String value)
	{
		super(value);
	}

	public Noun getSubject()
	{
		return subject;
	}

	public Noun getObject()
	{
		return object;
	}

	public ArrayList<Adverb> getAdverbs()
	{
		return adverbs;
	}
}
