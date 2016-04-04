package com.jeffsieu.smpproject;

import java.util.ArrayList;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Verb
{
	public Noun subject;
	public Noun object;

	private ArrayList<Adverb> adverbs;

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
