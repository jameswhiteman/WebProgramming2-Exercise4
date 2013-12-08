    /**
@author James Whiteman

This managed bean persists all of the voters
that register on the page, as well as the count
of how many voters there are total.
*/

package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Inject;

@ManagedBean
@Named("beanVoterCount")
@ApplicationScoped

public class BeanVoterCount
{
	// Properties
	private ArrayList<User> voters = new ArrayList<User>();

	// Main Methods
	public String getVoterCount()
	{
		return voters.size() + "";
	}

	// Setters
	public void addVoter(User voter)
	{
		voters.add(voter);
	}

	// Getters
	public ArrayList<User> getVoters()
	{
		return voters;
	}
}