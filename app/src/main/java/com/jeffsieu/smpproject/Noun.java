package com.jeffsieu.smpproject;

import java.util.ArrayList;

/**
 * Created by Jeff on 4/4/2016.
 */
public class Noun
{
	private ArrayList<Verb> verbs;
	private ArrayList<Adjective> adjectives;

	private Noun owner;
	private ArrayList<Noun> children;

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
