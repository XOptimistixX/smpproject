package model.word;

import java.util.ArrayList;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Noun extends Word
{
	protected ArrayList<Verb> verbs;
	protected ArrayList<Adjective> adjectives;

	protected Noun owner;
	protected ArrayList<Noun> children;

	public Noun(String value)
	{
		super(value);
	}

	public ArrayList<Verb> getVerbs()
	{
		return verbs;
	}

	public ArrayList<Adjective> getAdjectives()
	{
		return adjectives;
	}

	public Noun getOwner()
	{
		return owner;
	}

	public ArrayList<Noun> getChildren()
	{
		return children;
	}
}
