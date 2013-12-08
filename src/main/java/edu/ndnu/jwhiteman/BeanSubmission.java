/**
@author James Whiteman

Stores the data for the current user's listing submission, and passes
it to be persisted by the BeanListings managed bean, which it uses
as a managed property.
*/

package edu.ndnu.jwhiteman;

import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;

@ManagedBean
@Named("beanSubmission")
@RequestScoped
public class BeanSubmission
{
	//Properties
	@ManagedProperty(value="#{beanListings}")
	private BeanListings beanListings;
	private String title;
	private String name;
	private String phone;
	private String description;

	// Main
	public String addListing()
	{
		// Adds the current listing to BeanListings list of listings (wipes sweat off forehead)
		Listing listing = new Listing(title, name, phone, description);
		List<Listing> listings = beanListings.getListings();
		listings.add(listing);
		beanListings.setListings(listings);
		return "/summary.xhtml";
	}

	// Setters
	public void setBeanListings(BeanListings beanListings)
	{
		this.beanListings = beanListings;
	}

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
	public BeanListings getBeanListings()
	{
		return beanListings;
	}

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