/**
@author James Whiteman

A model class, associating all the elements
that are contained for a voter to register.
*/

package edu.ndnu.jwhiteman;

public class User
{
	// Properties
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String zipCode;
	private String party;
	private String braille;

	// Constructor
	public User(String firstName, String lastName, String phoneNumber, String zipCode, String party, String braille)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
		this.party = party;
		this.braille = braille;
	}

	// Setters
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public void setParty(String party)
	{
		this.party = party;
	}

	public void setBraille(String braille)
	{
		this.braille = braille;
	}

	// Getters
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public String getParty()
	{
		return party;
	}

	public String getBraille()
	{
		return braille;
	}
}