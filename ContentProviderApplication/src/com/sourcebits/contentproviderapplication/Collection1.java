package com.sourcebits.contentproviderapplication;

public class Collection1 
{
	int id;
	String name;
	public Collection1(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return(name);
	}
	public int getId()
	{
		return(id);
	}


}
