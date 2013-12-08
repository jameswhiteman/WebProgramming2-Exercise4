/**
@author James Whiteman

This class keeps track of the current user's info on
the voter registration page, ultimately submitting it
to the BeanVoterCount managed bean.
*/

package edu.ndnu.jwhiteman;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

@ManagedBean
@Named("beanUserInfo")
@SessionScoped
public class BeanUserInfo
{
	// Properties
	@ManagedProperty(value="#{beanVoterCount}")
	private BeanVoterCount beanVoterCount;
	private String firstName = "";
	private String lastName = "";
	private String phoneNumber = "";
	private String zipCode = "";
	private int party = 1;
	private boolean braille = false;
	private User submittedUser;

	// Main Methods
	public String infoSubmitted()
	{
		/* Creates a new user based on the current form data on the registration page.
			Adds the user to the voters list. Sets the user as the one that was just
			submitted. Then clears the form field. */
		User user = new User(firstName, lastName, phoneNumber, zipCode, getPartyName(), getBrailleStatus());
		beanVoterCount.addVoter(user);
		submittedUser = user;
		firstName = "";
		lastName = "";
		phoneNumber = "";
		zipCode = "";
		party = 1;
		braille = false;
		return "pageSubmit";
	}

	// Gets the party name given the int value from the radio fields.
	public String getPartyName()
	{
		switch (party)
		{
			case 1:
				return "Democrat";
			case 2:
				return "Green Party";
			case 3:
				return "Libertarian";
			case 4:
				return "Republican";
			default:
				return "Unaffiliated";
		}
	}

	// Gets the braille status given the bool value from the checkbox.
	public String getBrailleStatus()
	{
		if (braille)
			return "Yes";
		return "No";
	}

	// Setters
	public void setBeanVoterCount(BeanVoterCount beanVoterCount)
	{
		this.beanVoterCount = beanVoterCount;
	}

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

	public void setParty(int party)
	{
		this.party = party;
	}

	public void setBraille(boolean braille)
	{
		this.braille = braille;
	}

	public void setSubmittedUser(User submittedUser)
	{
		this.submittedUser = submittedUser;
	}

	// Getters
	public BeanVoterCount getBeanVoterCount()
	{
		return beanVoterCount;
	}

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

	public int getParty()
	{
		return party;
	}

	public boolean getBraille()
	{
		return braille;
	}

	public User getSubmittedUser()
	{
		return submittedUser;
	}
}