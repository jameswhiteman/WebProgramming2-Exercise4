/**
@author James Whiteman

A simple model class to store the attributes of a listing.
*/

package edu.ndnu.jwhiteman;

public class Listing
{
	// Properties
	private String title;
	private String name;
	private String phone;
	private String description;

	// Main Constructor
	public Listing(String title, String name, String phone, String description)
	{
		this.title = title;
		this.name = name;
		this.phone = phone;
		this.description = description;
	}

	// Setters
	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	// Getters
	public String getTitle()
	{
		return title;
	}

	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	public String getDescription()
	{
		return description;
	}
}